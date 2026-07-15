package com.dev.core.services;

import com.dev.core.exceptions.ClientNotFoundException;
import com.dev.core.exceptions.EmailAlreadyExistsException;
import com.dev.core.exceptions.InvalidUserException;
import com.dev.core.models.Client;
import com.dev.core.repositories.ClientRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client addClient(UUID id, String name, String email, String phone) {
        validarCamposObrigatorios(name, email);

        String normalizedEmail = normalizeEmail(email);

        if (clientRepository.findByEmail(normalizedEmail).isPresent()) {
            throw new EmailAlreadyExistsException();
        }

        Client client = new Client(id, name, normalizedEmail, phone);
        return clientRepository.save(client);
    }

    public void removeClient(UUID id) {
        if (!clientRepository.existsById(id)) {
            throw new ClientNotFoundException();
        }
        clientRepository.deleteById(id);
    }

    public Client getClient(UUID id) {
        return clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    public Client updateClient(UUID id, String name, String email, String phone) {
        Client targetClient =
                clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);

        validarCamposObrigatorios(name, email);

        String normalizedEmail = normalizeEmail(email);

        clientRepository
                .findByEmail(normalizedEmail)
                .ifPresent(
                        existing -> {
                            if (!existing.getId().equals(id)) {
                                throw new EmailAlreadyExistsException();
                            }
                        });

        targetClient.setName(name);
        targetClient.setEmail(normalizedEmail);
        targetClient.setPhone(phone);

        return clientRepository.save(targetClient);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    private void validarCamposObrigatorios(String name, String email) {
        if (!StringUtils.hasText(name)) {
            throw new InvalidUserException("O nome do cliente não pode ser vazio.");
        }
        if (!StringUtils.hasText(email)) {
            throw new InvalidUserException("O email do cliente não pode ser vazio.");
        }
    }

    private String normalizeEmail(String email) {
        if (email == null) {
            return null;
        }
        return email.trim().toLowerCase();
    }
}
