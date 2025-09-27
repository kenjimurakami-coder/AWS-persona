package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.PersonRequestDto;
import com.pragma.powerup.application.dto.response.PersonResponseDto;
import com.pragma.powerup.application.handler.IPersonHandler;
import com.pragma.powerup.application.mapper.IPersonRequestMapper;
import com.pragma.powerup.application.mapper.IPersonResponseMapper;
import com.pragma.powerup.domain.api.IPersonServicePort;
import com.pragma.powerup.domain.model.PersonModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonHandler implements IPersonHandler {

    private final IPersonServicePort personServicePort;

    private final IPersonRequestMapper personRequestMapper;

    private final IPersonResponseMapper personResponseMapper;

    public PersonHandler(IPersonServicePort personServicePort, IPersonRequestMapper personRequestMapper, IPersonResponseMapper personResponseMapper) {
        this.personServicePort = personServicePort;
        this.personRequestMapper = personRequestMapper;
        this.personResponseMapper = personResponseMapper;
    }

    @Override
    public void savePerson(PersonRequestDto personRequestDto) {
        PersonModel personModel = personRequestMapper.toPersonModel(personRequestDto);
        personServicePort.savePerson(personModel);
    }

    @Override
    public List<PersonResponseDto> getAllPeople() {
        return personResponseMapper.toResponseList(personServicePort.getAllPeople());
    }
}
