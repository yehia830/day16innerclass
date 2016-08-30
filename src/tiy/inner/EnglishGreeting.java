package tiy.inner;

/**
 * Created by Yehia830 on 8/30/16.
 */
public class EnglishGreeting {
        String name = "world";

    public void greet(){
        greetSomeone("world");
    }
    public void greetSomeone(String someone){
        name = someone;
        System.out.println("Hello " + name);
    }
}
