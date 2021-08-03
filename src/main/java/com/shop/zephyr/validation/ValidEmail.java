package com.shop.zephyr.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME) // slight variation - retention policy added
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {

	 String message() default "Invalid email";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};
}
