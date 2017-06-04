package com.epam.ration.converter;

import com.epam.ration.dto.PersonalInformationUserDto;
import com.epam.ration.dto.RegistrationUserDto;
import com.epam.ration.dto.SecurityUserDto;
import com.epam.ration.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface IUserConverter {

    @Mappings({
            @Mapping(target = "entity.firstName", source = "firstName"),
            @Mapping(target = "entity.lastName", source = "lastName"),
            @Mapping(target = "entity.height", source = "height"),
            @Mapping(target = "entity.weight", source = "weight"),
            @Mapping(target = "entity.age", source = "age"),
            @Mapping(target = "entity.role", source = "role")
    })
    User userDtoToUser(PersonalInformationUserDto userDto);

    @Mappings({
            @Mapping(target = "entity.email", source = "email"),
            @Mapping(target = "entity.password", source = "password")
    })
    User userDtoToUser(SecurityUserDto userDto);

    @Mappings({
            @Mapping(target = "entity.firstName", source = "firstName"),
            @Mapping(target = "entity.lastName", source = "lastName"),
            @Mapping(target = "entity.height", source = "height"),
            @Mapping(target = "entity.weight", source = "weight"),
            @Mapping(target = "entity.age", source = "age"),
            @Mapping(target = "entity.email", source = "email"),
            @Mapping(target = "entity.password", source = "password"),
            @Mapping(target = "entity.role", source = "role")
    })
    User userDtoToUser(RegistrationUserDto userDto);

    @Mappings({
            @Mapping(target = "dto.userId", source = "userId"),
            @Mapping(target = "dto.firstName", source = "firstName"),
            @Mapping(target = "dto.lastName", source = "lastName"),
            @Mapping(target = "dto.height", source = "height"),
            @Mapping(target = "dto.weight", source = "weight"),
            @Mapping(target = "dto.age", source = "age")
    })
    PersonalInformationUserDto userToUserDto(User user);

}
