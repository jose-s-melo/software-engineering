package com.dev.core.services;

import com.dev.core.models.Client;
import com.dev.core.repositories.ClientRepository;
import java.util.UUID;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client addClient(UUID id, String name, String email, String phone) {
        Client client = new Client(id, name, email, phone);
        Client savedClient = clientRepository.save(client);
        return savedClient;
    }

    public void removeClient(UUID id) {
        clientRepository.deleteById(id);
    }

    public Client getClient(UUID id) {
        Client foundClient = clientRepository.findById(id).orElse(null);
        return foundClient;
    }

    public Client updateClient(UUID id, String name, String email, String phone) {
        Client targetClient = clientRepository.findById(id).orElse(null);
        if (targetClient != null) {
            targetClient.setName(name);
            targetClient.setEmail(email);
            targetClient.setPhone(phone);
            targetClient = clientRepository.save(targetClient);
        }
        return targetClient;
    }

    public List<Client> getAllClients() {
        List<Client> allClients = clientRepository.findAll();
        return allClients;
    }
}