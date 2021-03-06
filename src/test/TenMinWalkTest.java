package test;

import main.TenMinWalk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TenMinWalkTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false2", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false3", false, TenMinWalk.isValid(new char[] {'w'}));
        assertEquals("Should return false4", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false4", false, TenMinWalk.isValid(new char[] {}));
    }
}