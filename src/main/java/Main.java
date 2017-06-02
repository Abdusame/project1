/**
 * Created by Абдусамеъ on 02.06.2017.
 */
public class Main {
    public static void main(String[] args){
        TestChangeClass tc = new TestChangeClass();
        tc.before();
        tc.testChangeMethod(2,"Pass");
        tc.testChangeMethod(4,"Pass");
        tc.testChangeMethod(5,"Pass");

        TestGetClass tg = new TestGetClass();
        tg.before();
        tg.testGetMethod();
    }
}
