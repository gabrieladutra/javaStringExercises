package questions_0_10Test;

import org.junit.jupiter.api.Test;
import questions_0_10.Question1;

import static org.junit.jupiter.api.Assertions.*;
public class question1Test {
    @Test
    public void getCharacter_whenAStringIsValid_shouldReturnACharAtSpecificPosition(){
        String str = "Java Exercises!";
        assertEquals("The character at position 0 is J", Question1.getCharacter(str,0));
    }

}
