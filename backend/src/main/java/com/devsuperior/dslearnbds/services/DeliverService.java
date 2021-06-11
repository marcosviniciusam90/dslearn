package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import com.devsuperior.dslearnbds.services.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DeliverService {

    private final DeliverRepository repository;

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        try {
            Deliver entity = repository.getOne(id);
            entity.setStatus(dto.getStatus());
            entity.setFeedback(dto.getFeedback());
            entity.setCorrectCount(dto.getCorrectCount());
            repository.save(entity);
        } catch (EntityNotFoundException ex) {
            throw new ResourceNotFoundException(id);
        }
    }

}
