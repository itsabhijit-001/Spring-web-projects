package org.antwalk.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrganizationConstraintValidator implements ConstraintValidator<Organization,String>
{
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
		boolean res=value.contains("nriFintech");
		return res;
	}

}