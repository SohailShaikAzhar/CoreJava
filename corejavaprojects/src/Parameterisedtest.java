import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterisedtest 
{
    @ParameterizedTest
//    @ValueSource(strings = {"call", "bali", "suri"})     // Test fail
    @ValueSource(strings = {"calli", "bali", "suri"})     //Test pass
    void endswithI(String str)
    {
    	assertTrue(str.endsWith("i"));
    }
}
