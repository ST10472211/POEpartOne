package poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class POEpart1Test {

    public POEpart1Test() {
    }

    // TESTING USERNAME
    @Test
    public void testIsValidUsername_Valid() {
        assertTrue(POEpart1.isValidUsername("kyl_1"), "Username should be valid");
    }

    @Test
    public void testIsValidUsername_Invalid() {
        assertFalse(POEpart1.isValidUsername("kyl!!!!!!"), "Username should be invalid");
    }

    // TESTING PASSWORD
    @Test
    public void testIsValidPassword_Valid() {
        assertTrue(POEpart1.isValidpassword("Ch&&sec@ke99!"), "Password should be valid");
    }

    @Test
    public void testIsValidPassword_Invalid() {
        assertFalse(POEpart1.isValidpassword("password"), "Password should be invalid");
    }

    // TESTING CELLPHONE NUMBER
    @Test
    public void testIsValidCellno_Valid() {
        assertTrue(POEpart1.isValidcellno("+27838968976"), "Cell number should be valid");
    }

    @Test
    public void testIsValidCellno_Invalid() {
        assertFalse(POEpart1.isValidcellno("08966553"), "Cell number should be invalid");
    }

    // We generally don't test main() unless using integration or functional testing
    // But you can leave this stub for structure
    @Test
    public void testMain() {
        // This can remain empty or just confirm no crash on run if needed
    }
}
