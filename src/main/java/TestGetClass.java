import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestGetClass {
    Singleton X;

    @BeforeMethod
    public void before(){
        X = Singleton.getInstance();
        X.populate();
    }

    @Test
    public void testGetMethod(){
        String str = X.get();
        assertTrue(str.substring(1).equals("ass"), "Строка " + str + " не содержит подстроку 'ass'");
    }
}
