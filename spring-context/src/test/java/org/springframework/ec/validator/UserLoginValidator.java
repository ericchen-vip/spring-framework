package org.springframework.ec.validator;

import org.springframework.ec.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author EricChen 2020/12/28 15:17
 */
public class UserLoginValidator implements Validator {
    private static final int NAME_PASSWORD_LENGTH = 6;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
        errors.rejectValue("name", "name.min.length",
                new Object[]{NAME_PASSWORD_LENGTH},
                "The password must be at least [" + NAME_PASSWORD_LENGTH + "] characters in length.");
    }
}
