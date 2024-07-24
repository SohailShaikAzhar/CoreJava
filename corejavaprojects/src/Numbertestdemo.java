import static org.junit.Assert.*;

public class Numbertestdemo 
{
    void factorialtest()
    {
    	int exp=120;
    	int act=NumberFunction.getfacotrial(5);
    	assertEquals(exp, act);
    }
}
