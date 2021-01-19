package org.springframework.ec.messagesource;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author EricChen 2020/12/28 15:01
 */
public class MessageSourceTests {


    @Test
    public void testReloadableResourceBundleMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("org/springframework/context/support/messages");
        assertThat(messageSource.getMessage("code1", null, Locale.ENGLISH)).isEqualTo("message1");
        assertThat(messageSource.getMessage("code2", null, Locale.GERMAN)).isEqualTo("nachricht2");
        messageSource.clearCache();
    }

}
