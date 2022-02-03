import static org.junit.Assert.*;
import org.junit.*;

public class SDTest {
    
    @Test
    public void concatTest() {
        assertEquals("CSE15L", SD.concat("CSE", "15L"));
    }

}
