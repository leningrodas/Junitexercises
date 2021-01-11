import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){

        CodeupCrypt.version = 1.3;
        assertEquals(1.2, CodeupCrypt.version, 0);



    }

    @Test
    public void testHashPassword() {
        assertEquals("S0ph13", CodeupCrypt.hashPassword("Sophie"));

        assertEquals("F3r", CodeupCrypt.hashPassword("fer"));
    }

    @Test
    public void testHashPass(){
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "F3r"));



    }

}
