package com.shop.zephyr.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator  implements ConstraintValidator<ValidPhone, String> {
	
	private Pattern pattern;
	private Matcher matcher;
	private static final String PHONE_PATTERN = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
		      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
		      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

	@Override
	public void initialize(ValidPhone constraintAnnotation) {
	}

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
		return (validatePhone(phoneNumber));
	}

	private boolean validatePhone(String phoneNumber) {
		pattern = Pattern.compile(PHONE_PATTERN);
		matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

}
