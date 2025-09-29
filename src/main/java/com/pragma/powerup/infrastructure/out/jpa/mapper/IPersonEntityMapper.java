package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.PersonModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface IPersonEntityMapper {

    PersonEntity toPersonEntity(PersonModel personModel);

    PersonModel toPersonModel(PersonEntity personEntity);

    List<PersonModel> toPersonModelList(List<PersonEntity> personEntityList);
}
