import java.util.ArrayList;
import java.util.Random;

public class Singleton {
    private static Singleton instance;
    private ArrayList<String> array;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void populate(){
        if(array == null) {
            array = new ArrayList<String>();
            final Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int r = random.nextInt(2);
                if (r == 0) {
                    array.add("Fail");
                } else if (r == 1) {
                    array.add("Pass");
                }
            }
            /*for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }*/
        }
    }

    public String get(){
        int size = array.size();
        final Random random = new Random();
        return array.get(random.nextInt(size));
    }

    public void change(int index, String value){
        array.set(index, value);
    }

    public String getValue(int index){
        return array.get(index);
    }
}