package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPersonServicePort;
import com.pragma.powerup.domain.model.PersonModel;
import com.pragma.powerup.domain.spi.IPersonPersistencePort;

import java.util.List;

public class PersonServiceImpl implements IPersonServicePort {

    private final IPersonPersistencePort personPersistencePort;

    public PersonServiceImpl(IPersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public void savePerson(PersonModel person) {
        personPersistencePort.savePerson(person);
    }

    @Override
    public List<PersonModel> getAllPeople() {
        return personPersistencePort.getAllPeople();
    }
}
