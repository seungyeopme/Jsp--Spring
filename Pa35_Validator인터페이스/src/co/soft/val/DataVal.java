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
		
		Data1 d1 = (Data1)obj;
		
		String s2 = d1.getS2();
		String s3 = d1.getS3();
		
		if(s2.contains("*")==false) {
			errors.rejectValue("s2", "err4");
		}
		if(s3.length() > 5) {
			errors.rejectValue("s3", "err5");
		}
	}
}