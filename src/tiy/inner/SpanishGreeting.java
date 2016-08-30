package tiy.inner;

/**
 * Created by Yehia830 on 8/30/16.
 */
public class SpanishGreeting {
    String name = "mundo";
    public void greet() {
        greetSomeone("mundo");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hola, " + name);
    }
}
