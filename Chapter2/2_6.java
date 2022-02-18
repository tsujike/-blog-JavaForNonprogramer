public class Sample2_6 {
    public static void main(String[] args) {
        Dog.cry(); // => ワンワン
        new Cat().cry(); // => にゃー
    }
}

class Dog {
    static void cry() {
        System.out.println("ワンワン");
    }
}

class Cat {
    void cry() {
        System.out.println("にゃー");
    }
}
