public class Sample2_2 {

    public static void main(String[] args) {
        new Sample2_2().hello(); // => こんにちわ！
        new Sample2_2().bye(); // => さようなら。
    }

    void hello() {
        System.out.println("こんにちわ！");
    }

    void bye() {
        System.out.println("さようなら。");
    }
}
