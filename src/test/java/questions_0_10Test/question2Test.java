package questions_0_10Test;
import org.junit.jupiter.api.Test;
import questions_0_10.Question2;

import static org.junit.jupiter.api.Assertions.*;
public class question2Test {
    @Test
    public void getUnicodeChar_whenAStringIsValid_shouldReturnUnicodePoint(){
        String str = "w3resource.com";
        assertEquals("Character(unicode point) = 101", Question2.getUnicodeChar(str,3));
    }
}
