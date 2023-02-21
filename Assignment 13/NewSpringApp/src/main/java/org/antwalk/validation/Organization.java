package org.antwalk.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=OrganizationConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)


public @interface Organization 
{
	public String message() default "it must contain nriFintech";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
