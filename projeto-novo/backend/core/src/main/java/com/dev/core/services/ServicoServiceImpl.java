package com.dev.core.services;

import com.dev.core.dtos.ServicoDTO;
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
                .orElseThrow(() ->
                        new EntityNotFoundException("Serviço não encontrado com id: " + id));
    }

    public Servico create(Servico servico) {
        servico.setId(null);
        return servicoRepository.save(servico);
    }

    public Servico update(UUID id, Servico servico) {
        Servico existing = findById(id);

        existing.setNome(servico.getNome());
        existing.setPreco(servico.getPreco());
        existing.setTempoEstimado(servico.getTempoEstimado());

        return servicoRepository.save(existing);
    }

    public void delete(UUID id) {
        Servico servico = findById(id);
        servicoRepository.delete(servico);
    }

    public List<ServicoResponseDTO> findAllDto() {
        return servicoRepository.findAll()
                .stream()
                .map(servico -> new ServicoResponseDTO(
                        servico.getId(),
                        servico.getNome(),
                        servico.getPreco(),
                        servico.getTempoEstimado()
                ))
                .toList();
    }
}
