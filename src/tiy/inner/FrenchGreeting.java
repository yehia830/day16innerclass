package tiy.inner;

/**
 * Created by Yehia830 on 8/30/16.
 */
public class FrenchGreeting {
    String name = "tout le monde";
    public void greet() {
        greetSomeone("tout le monde");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut " + name);
    }
}
