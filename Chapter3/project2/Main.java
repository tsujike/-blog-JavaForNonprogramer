public class Main {
    public static void main(String[] args) {  
        String greetJp = new greeting.jp.Japanese().greet();
        System.out.println(greetJp);
        String greetEn = new greeting.en.English().greet();
        System.out.println(greetEn);  
    }
}
