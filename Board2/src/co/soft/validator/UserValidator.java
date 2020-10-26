package co.soft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co.soft.beans.UserInfo;

//rejectValue
//▪   유효성 조건을 직접 만들어 검사할 때 사용합니다.
//▪   If문으로 유효성 검사를 해주고 위배시 rejectValue를 통해 오류 정보를 지정합니다..
//▪   rejectValue( “프로퍼티이름“, “코드이름“)
//▪   입력값에 문제가 있다면 error 객체에 오류정보를 저장합니다. 사용할 오류 메시지는 “코드이름.bean객체이름.프로퍼티이름”으로 구성됩니다.
public class UserValidator implements Validator {
	
	@Override
	   public boolean supports(Class<?> clazz) {
	      // TODO Auto-generated method stub
	      return UserInfo.class.isAssignableFrom(clazz);
	   }
	
	@Override
	public void validate(Object target, Errors errors) {
		UserInfo user = (UserInfo)target;
		
		//비밀번호랑 비밀번호 확인이랑 비교해서 false이면
		//not equal.. rejectValue()
		if(user.getUser_pw().equals(user.getUser_pw2())==false) {
			errors.rejectValue("user_pw", "not_equal");
			errors.rejectValue("user_pw2", "not_equal");
		}
		
		
		
	}
}
