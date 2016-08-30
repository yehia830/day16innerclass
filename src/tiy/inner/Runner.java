package tiy.inner;

/**
 * Created by Yehia830 on 8/30/16.
 */
public class Runner {
    public static void main(String[] args) {
    EnglishGreeting englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        FrenchGreeting frenchGreeting = new FrenchGreeting();
        frenchGreeting.greetSomeone("Fred");
        SpanishGreeting spanishGreeting = new SpanishGreeting();
        spanishGreeting.greet();

    }
}

