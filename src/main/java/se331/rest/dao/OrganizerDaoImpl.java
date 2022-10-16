package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Organizer;
import se331.rest.repository.OrganizerRepository;
import se331.rest.entity.Event;
import java.util.Optional;

@Repository
public class OrganizerDaoImpl implements OrganizerDao {
    @Autowired
    OrganizerRepository organizerRepository;

    @Override
    public Page<Organizer> getOrganizer(Pageable pageRequest) {
        return organizerRepository.findAll(pageRequest);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }
    @Override

    public Optional<Organizer> findById(Long id) {
         return organizerRepository.findById(id);

    }
    @Override
    public   Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}

