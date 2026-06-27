package com.dev.core.services.client;

import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.Client;
import com.dev.core.models.user.User;
import com.dev.core.repositories.ClientRepository;

import java.net.UnknownServiceException;
import java.util.UUID;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client addClient(User user, String name, String phone) {
        Client client = Client.builder().name(name).phone(phone).id(user.getId()).build();
        return clientRepository.save(client);
    }

    public void removeClient(UUID id) {
        clientRepository.deleteById(id);
    }

    public Client getClient(UUID id) {
        return clientRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public Client updateClient(UUID id, String name, String phone) {
        Client targetClient = clientRepository.findById(id).orElseThrow(UserNotFoundException::new);
        targetClient.setName(name);
        targetClient.setPhone(phone);
        targetClient = clientRepository.save(targetClient);
        return targetClient;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}