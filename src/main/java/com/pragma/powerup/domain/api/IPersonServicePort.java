package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.PersonModel;

import java.util.List;

public interface IPersonServicePort {

    void savePerson(PersonModel person);

    List<PersonModel> getAllPeople();
}
