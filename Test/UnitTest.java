import org.junit.*;
import static org.junit.Assert.assertEquals;

public class UnitTest
{
    @Test
    public void testadd()
    {
        assertEquals(2,Calc.add(1,1));
    }
    @Test
    public void testsub()
    {
        assertEquals(2,Calc.sub(1,1));
    }
    @Test
    public void testmult()
    {
        assertEquals(2,Calc.mult(1,1));
    }
    @Test
    public void testdiv()
    {
        assertEquals(2,Calc.div(1,1));
    }



}
