package co.soft.validator;

import org.springframework.validation.Validator;

import co.soft.beans.UserInfo;

public class UserValidator implements Validator {
	
	@Override
	   public boolean supports(Class<?> clazz) {
	      // TODO Auto-generated method stub
	      return UserInfo.class.isAssignableFrom(clazz);
	   }
	
	@Override
	public void validate(Object target, Errors errors) {
		
		
	}
}
