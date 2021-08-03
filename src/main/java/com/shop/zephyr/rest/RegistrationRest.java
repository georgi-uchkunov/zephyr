package com.shop.zephyr.rest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.shop.zephyr.dto.UserDto;

public class RegistrationRest {

	@GetMapping("/user/registration")
	public String showRegistrationForm(WebRequest request, Model model) {
	    UserDto userDto = new UserDto();
	    model.addAttribute("user", userDto);
	    return "registration";
	}
	
	public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto,
			  HttpServletRequest request, Errors errors) {
				return null;
			    //...
			}
}
