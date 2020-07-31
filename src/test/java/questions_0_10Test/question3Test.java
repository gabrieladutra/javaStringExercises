package questions_0_10Test;

import org.junit.jupiter.api.Test;
import questions_0_10.Question3;

import static org.junit.jupiter.api.Assertions.*;

public class question3Test {
    @Test
    public void getCharPoint_whenStringIsValid_shouldReturnCharPoint(){
        String str = "aw3resource.com";
        assertEquals(97, Question3.getCharPoint(str,1));
    }
}
