package com.dev.core.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Value("${api.security.issuer}")
    public String ISSUER;

    @Value("${api.security.token.secret}")
    private String SECRET;

    public String generateToken(UserDetails user) {
        Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);
        try {
            List<String> roles =
                    user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();

            return JWT.create()
                    .withIssuer(ISSUER)
                    .withSubject(user.getUsername())
                    .withClaim("roles", roles)
                    .withExpiresAt(generateExpiration())
                    .sign(ALGORITHM);
        } catch (JWTCreationException e) {
            return null;
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);
            return JWT.require(ALGORITHM).withIssuer(ISSUER).build().verify(token).getSubject();
        } catch (JWTVerificationException e) {
            return null;
        }
    }

    public boolean isAdmin(String authHeader) {
        String token = extractToken(authHeader);
        boolean response = false;

        if (validateToken(token) != null
                && JWT.decode(token).getClaim("roles").asList(String.class).stream()
                        .anyMatch(role -> role.contains("ADMIN"))) {
            response = true;
        }

        return response;
    }

    private String extractToken(String authHeader) {
        String tokenExtract = null;

        if (authHeader != null) {
            tokenExtract = authHeader.replace("Bearer ", "");
        }

        return tokenExtract;
    }

    private Instant generateExpiration() {
        return Instant.now().plusSeconds(2 * 60 * 60);
    }
}
