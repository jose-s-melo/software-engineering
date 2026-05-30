package com.dev.core.models.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "users")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private UserRole role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<? extends GrantedAuthority> authorities;

        if (this.role == null) {
            authorities = List.of(new SimpleGrantedAuthority("ROLE_COMMON"));
        } else authorities= switch (role) {
            case CLIENTE -> List.of(new SimpleGrantedAuthority("ROLE_CLIENTE"));
            case BARBEIRO -> List.of(new SimpleGrantedAuthority("ROLE_BARBEIRO"));
            case ADMIN -> List.of(
                    new SimpleGrantedAuthority("ROLE_ADMIN"),
                    new SimpleGrantedAuthority("ROLE_COMMON"),
                    new SimpleGrantedAuthority("ROLE_BARBEIRO"),
                    new SimpleGrantedAuthority("ROLE_CLIENTE"));
            case COMMON -> List.of(new SimpleGrantedAuthority("ROLE_COMMON"));
        };

        return authorities;
    }

    @Override
    public String getUsername() {
        return this.email;
    }
}
