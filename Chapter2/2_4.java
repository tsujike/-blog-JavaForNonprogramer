public class Sample2_4 {

    // フィールド
    int tripleNumber;

    public static void main(String[] args) {
        new Sample2_4(555).getTripleNumber(); // => 今日のトリプルナンバーは555です
    }

    //コンストラクタ
    public Sample2_4(int number) {
        tripleNumber = number;
    }

    void getTripleNumber() {
        System.out.println("今日のトリプルナンバーは" + tripleNumber + "です");
    }
}
