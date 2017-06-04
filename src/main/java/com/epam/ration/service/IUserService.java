package com.epam.ration.service;

import com.epam.ration.dto.PersonalInformationUserDto;
import com.epam.ration.dto.RegistrationUserDto;
import com.epam.ration.dto.SecurityUserDto;
import com.epam.ration.response.ServiceResponse;

public interface IUserService {

    ServiceResponse<PersonalInformationUserDto> authorizeUser(SecurityUserDto userDto);
    ServiceResponse<Void> registrationUser(RegistrationUserDto userDto);
    ServiceResponse<PersonalInformationUserDto> updateUser(PersonalInformationUserDto userDto);

}
