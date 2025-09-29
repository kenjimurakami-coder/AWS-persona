package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.PersonResponseDto;
import com.pragma.powerup.domain.model.PersonModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface IPersonResponseMapper {

    PersonResponseDto toResponse(PersonModel personModel);

    List<PersonResponseDto> toResponseList(List<PersonModel> personModelList);

}
