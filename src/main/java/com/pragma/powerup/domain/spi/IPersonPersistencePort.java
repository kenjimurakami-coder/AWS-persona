package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.PersonModel;

import java.util.List;

public interface IPersonPersistencePort {

    PersonModel savePerson(PersonModel person);

    List<PersonModel> getAllPeople();
}
