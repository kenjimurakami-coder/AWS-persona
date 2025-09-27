package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.PersonRequestDto;
import com.pragma.powerup.application.dto.response.PersonResponseDto;

import java.util.List;

public interface IPersonHandler {

    void savePerson(PersonRequestDto personRequestDto);

    List<PersonResponseDto> getAllPeople();
}
