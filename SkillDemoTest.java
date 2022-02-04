import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSkillDemo() {
        assertEquals("Annie Liu", SkillDemo.formatName("Annie", "Liu")); // test should fail!
    }
}
