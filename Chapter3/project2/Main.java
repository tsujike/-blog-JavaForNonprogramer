import greeting.jp.Japanese;
import greeting.en.English;

public class Main {
    public static void main(String[] args) {
        String greetJp = new Japanese().greet();
        System.out.println(greetJp);
        String greetEn = new English().greet();
        System.out.println(greetEn);
    }
}
