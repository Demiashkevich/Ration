package com.epam.ration.service.impl;

import com.epam.ration.converter.IUserConverter;
import com.epam.ration.dao.UserRepository;
import com.epam.ration.dto.PersonalInformationUserDto;
import com.epam.ration.dto.RegistrationUserDto;
import com.epam.ration.dto.SecurityUserDto;
import com.epam.ration.entity.User;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IUserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    private IUserConverter mapping = Mappers.getMapper(IUserConverter.class);

    @Override
    public ServiceResponse<PersonalInformationUserDto> authorizeUser(SecurityUserDto userDto) {
        User user = userRepository.findUserByEmail(userDto.getEmail());
        if (user != null) {
            if (user.getPassword().equals(userDto.getPassword())) {
                PersonalInformationUserDto personalUserDto = mapping.userToUserDto(user);
                return new ServiceResponse<>(personalUserDto, Status.SUCCESS);
            }
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    @Override
    public ServiceResponse<Void> registrationUser(RegistrationUserDto userDto) {
        if (this.isEmailExists(userDto.getEmail())) {
            return new ServiceResponse<>(Status.FAILED_UNIQUE, "There is an account with that email address:" +  userDto.getEmail());
        }
        User user = mapping.userDtoToUser(userDto);
        userRepository.save(user);
        return new ServiceResponse<>(Status.SUCCESS);
    }

    @Override
    public ServiceResponse<PersonalInformationUserDto> updateUser(PersonalInformationUserDto userDto) {
        User user = mapping.userDtoToUser(userDto);
        User userSave = userRepository.save(user);
        userDto = mapping.userToUserDto(userSave);
        if (userSave != null) {
            return new ServiceResponse<>(userDto, Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    private boolean isEmailExists(final String EMAIL) {
        User response = userRepository.findUserByEmail(EMAIL);
        if (response != null) {
            return true;
        }
        return false;
    }
}
