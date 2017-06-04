package com.epam.ration.controller;

import com.epam.ration.dto.PersonalInformationUserDto;
import com.epam.ration.dto.RegistrationUserDto;
import com.epam.ration.dto.SecurityUserDto;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
@SessionAttributes("personalInformationUserDto")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/authorize", method = RequestMethod.GET)
    public String transitionAuthorize(@ModelAttribute("securityUserDto") SecurityUserDto userDto){
        return "authorize";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String transitionRegistration(@ModelAttribute("registrationUserDto") RegistrationUserDto userDto){
        return "registration";
    }

    @RequestMapping(value = "/authorize", method = RequestMethod.POST)
    public ModelAndView authorize(@ModelAttribute("securityUserDto") @Valid SecurityUserDto userDto,
                                  BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("authorize");
        }
        ServiceResponse<PersonalInformationUserDto> response = userService.authorizeUser(userDto);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect:/home", "personalInformationUserDto", response.getBody());
        }
        return new ModelAndView("authorize");
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute("registrationUserDto") @Valid RegistrationUserDto userDto,
                                     BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("registration");
        }
        ServiceResponse<Void> response = userService.registrationUser(userDto);
        if (response.getStatus() == Status.FAILED_UNIQUE) {
            result.addError(new FieldError("registrationUserDto", "email", response.getMessage()));
            return new ModelAndView("registration");
        }
        return new ModelAndView("redirect:/user/authorize");
    }

}
