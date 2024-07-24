import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class Testassumption 
{
    @Test
    void testassumption()
    {
    	int a= 5, b= 5;
    	Assumptions.assumingThat(a==b, () -> (System.out.println("Testing passed")))
    }
}
