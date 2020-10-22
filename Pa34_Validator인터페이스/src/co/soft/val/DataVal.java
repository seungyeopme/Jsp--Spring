package co.soft.val;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co.soft.beans.Data1;

public class DataVal implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) { 
		return Data1.class.isAssignableFrom(clazz);	
	}
	
	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "s2", "err2");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "s3", "err3");
	}
}
