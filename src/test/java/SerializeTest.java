import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Serialize;
import src.User;
import src.User.*;

public class SerializeTest {
    @Test
    public void parseString_whenAStringIsValid_shouldReturnAIntArray() {
        assertArrayEquals(new int[]{1, 2, 3}, Serialize.getIntArray("1,2,3"));
    }

    @Test
    public void getString_whenAIntArrayIsValid_shouldReturnAString(){
        assertEquals("1,2,3", Serialize.getString(new int[]{1, 2, 3}));
    }

    @Test
    public void getClassField_whenAIntArrayIsValid_shouldReturnUserInstance(){
        int[] intArray = new int[] {1,2,3};
        String[] strArray = new String[]{"a", "b"};
        User u = new User(intArray,strArray);
        assertArrayEquals(intArray, u.intArray);
        assertArrayEquals(strArray, u.stringArray);
    }

}
