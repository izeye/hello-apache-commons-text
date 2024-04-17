package learningtest.org.apache.commons.text;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link StringEscapeUtils}.
 *
 * @author Johnny Lim
 */
class StringEscapeUtilsTests {

    @Test
    void unescapeJava() {
        assertThat("\u0026").isEqualTo("&");
        assertThat("\\u0026").isNotEqualTo("&");

        assertThat(StringEscapeUtils.unescapeJava("\\u0026")).isEqualTo("&");
    }

}
