import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class LoginTest {

    @Test
    void Inloggen() {
        Login test = new Login();
        assertTrue(test.Inloggen("admin", "abc123"));
        assertFalse(test.Inloggen("test", "abc123"));
        assertFalse(test.Inloggen("admin", "123456"));
        assertFalse(test.Inloggen("test", "123456"));
    }
}