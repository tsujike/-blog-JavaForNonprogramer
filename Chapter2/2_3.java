public class Sample2_3 {

    //フィールド
    int tripleNumber = 777;

    public static void main(String[] args) {
        new Sample2_3().getTripleNumber(); // => 今日のトリプルナンバーは777です
    }

    void getTripleNumber() {
        System.out.println("今日のトリプルナンバーは" + tripleNumber + "です");
    }
}
