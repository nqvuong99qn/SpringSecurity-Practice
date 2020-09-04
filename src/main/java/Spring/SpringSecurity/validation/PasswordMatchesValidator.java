package Spring.SpringSecurity.validation;

import Spring.SpringSecurity.web.dto.UserDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {


    @Override
    public void initialize(final PasswordMatches constrainAnnotation){

    }
    @Override
    public boolean isValid(final Object object, final ConstraintValidatorContext context){
        final UserDto user = (UserDto) object;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
