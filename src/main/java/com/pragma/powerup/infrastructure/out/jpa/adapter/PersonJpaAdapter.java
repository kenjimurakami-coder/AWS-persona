package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.PersonModel;
import com.pragma.powerup.domain.spi.IPersonPersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.PersonEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IPersonEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IPersonRepository;

import java.util.List;

public class PersonJpaAdapter implements IPersonPersistencePort {

    private final IPersonRepository personRepository;

    private final IPersonEntityMapper personEntityMapper;

    public PersonJpaAdapter(IPersonRepository personRepository, IPersonEntityMapper personEntityMapper) {
        this.personRepository = personRepository;
        this.personEntityMapper = personEntityMapper;
    }
    @Override
    public PersonModel savePerson(PersonModel personModel) {
        PersonEntity personEntity = personEntityMapper.toPersonEntity(personModel);
        PersonEntity savedEntity = personRepository.save(personEntity);
        return personEntityMapper.toPersonModel(savedEntity);
    }

    @Override
    public List<PersonModel> getAllPeople() {
        List<PersonEntity> personEntityList = personRepository.findAll();
        if (personEntityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return personEntityMapper.toPersonModelList(personEntityList);
    }
}
