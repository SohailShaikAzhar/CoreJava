import static org.junit.Assert.*;

import org.junit.Test;

public class Assertdemo 
{
	@Test
    public void testfoassertequal()
    {
    	int res =1;
    	int exp = 0;
    	assertEquals(res, exp);
    }
    @Test
    void testassertTruw()
    {
    	assertTrue("hello" .contains("i"));
    }
    @Test
    void testnull()
    {
    	String n = "j";
    	assertNull(" ");
    }
}
