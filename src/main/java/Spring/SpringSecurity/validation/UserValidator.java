package Spring.SpringSecurity.validation;

import Spring.SpringSecurity.web.dto.UserDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(final Class<?> clazz){
        return UserDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(final Object object, final Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "firstName", "message.firstName", "First Name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "firstLast", "message.lastName", "Last Name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "username", "message.username", "User Name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "password", "message.password", "Password is required");
    }
}
