import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

public class Assumptiondemo 
{
    @Test
    void testonassume()
    {
    	int a = 5, b = 25;
    	Assumptions.assumeTrue(b==a*a);
    	System.out.println("it will display");
    }
}
