import lrapi.lr;

public class Actions{

	public int init() throws Throwable {
		return 0;
	}


	public int action() throws Throwable {
		TestGetClass tg = new TestGetClass();
		tg.before();
		tg.testGetMethod();
		
		TestChangeClass tc = new TestChangeClass();
		tc.before();
		tc.testChangeMethod(2,"Pass");
		tc.testChangeMethod(4,"Pass");
		tc.testChangeMethod(5,"Pass");
		return 0;
	}


	public int end() throws Throwable {
		return 0;
	}
}
