package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.IPersonServicePort;
import com.pragma.powerup.domain.spi.IPersonPersistencePort;
import com.pragma.powerup.domain.usecase.PersonServiceImpl;
import com.pragma.powerup.infrastructure.out.jpa.adapter.PersonJpaAdapter;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IPersonEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IPersonRepository personRepository;

    private final IPersonEntityMapper personEntityMapper;

    @Bean
    public IPersonPersistencePort personPersistencePort() {
        return new PersonJpaAdapter(personRepository, personEntityMapper);
    }

    @Bean
    public IPersonServicePort personServicePort() {
        return new PersonServiceImpl(personPersistencePort());
    }
   }