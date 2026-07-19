package com.dev.core.services;

import com.dev.core.dtos.ServicoDTO;
import com.dev.core.dtos.ServicoRequestFrontendDTO;
import com.dev.core.dtos.ServicoResponseDTO;
import com.dev.core.models.Servico;
import com.dev.core.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServicoServiceImpl {

    private final ServicoRepository servicoRepository;

    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    public Servico findById(UUID id) {
        return servicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Serviço não encontrado com id: " + id));
    }

    public Servico create(ServicoRequestFrontendDTO servico) {
        Servico service = Servico.builder()
                .description(servico.description())
                .name(servico.name())
                .price(servico.price())
                .estimatedTime(servico.estimatedTime())
                .build();

        return servicoRepository.save(service);
    }

    public Servico update(UUID id, ServicoRequestFrontendDTO servico) {
        Servico existing = findById(id);

        existing.setName(servico.name());
        existing.setPrice(servico.price());
        existing.setEstimatedTime(servico.estimatedTime());
        existing.setDescription(servico.description());

        return servicoRepository.save(existing);
    }

    public void delete(UUID id) {
        Servico servico = findById(id);
        servicoRepository.delete(servico);
    }

    public List<ServicoResponseDTO> findAllDto() {
        return servicoRepository.findAll()
                .stream()
                .map(servico -> new ServicoResponseDTO(servico.getId(), servico.getName(), servico.getPrice(),
                        servico.getEstimatedTime(), servico.getDescription()))
                .toList();
    }
}
