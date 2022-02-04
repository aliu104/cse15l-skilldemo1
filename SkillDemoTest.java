import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSkillDemo() {
        assertEquals("AnnieLiu", SkillDemo.formatName("Annie", "Liu")); // test should fail!
    }
}
