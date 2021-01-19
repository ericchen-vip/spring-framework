package org.springframework.ec.validator;

import org.junit.jupiter.api.Test;
import org.springframework.ec.User;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author EricChen 2020/12/28 15:15
 */
public class ValidatorTests {


    @Test
    public void testUserLoginValidator() {
        UserLoginValidator userLoginValidator = new UserLoginValidator();
        User user = new User();
        Errors errors = new BeanPropertyBindingResult(user, "user");
        user.setName("a");
        assertThat(userLoginValidator.supports(user.getClass())).isEqualTo(true);
        userLoginValidator.validate(user, errors);
        final int errorCount = errors.getErrorCount();
        System.out.println(errorCount);
        Stream.of(errors.getAllErrors()).forEach(System.out::println);

    }

}
