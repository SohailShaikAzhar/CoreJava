import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Helloworldtest 
{
	@Test
    void print()
    {
    	System.out.println("Hello");
    }
	@Test
	void show()
	{
		System.out.println("Welcome to java");
	}
	@RepeatedTest(3)
	void display()
	{
		System.out.println("Hello World");
	}
}
