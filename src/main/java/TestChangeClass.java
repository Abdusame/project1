import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestChangeClass {
    private Singleton X;

    @DataProvider(name = "arraych")
    public Object[][] simpleDataProvider(){
        return new Object[][]{
                {4, "test"},
                {8, "test"},
                {12, "test"}
        };
    }

    @BeforeMethod
    public void before(){
        X = Singleton.getInstance();
        X.populate();
    }

    @Test(dataProvider = "arraych")
    public void testChangeMethod(int firstPar, String secondPar){
        X.change(firstPar, secondPar);
        assertTrue(X.getValue(firstPar).equals("Pass"));
    }
}