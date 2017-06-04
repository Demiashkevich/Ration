package com.epam.ration.validation.custom;

import com.epam.ration.dto.RegistrationUserDto;
import com.epam.ration.validation.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches passwordMatches) {

    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        RegistrationUserDto userDto = (RegistrationUserDto)object;
        return userDto.getPassword().equals(userDto.getMatchingPassword());
    }
}
