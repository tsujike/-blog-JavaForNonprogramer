public class Sample2_5 {

    public static void main(String[] args) {
        int num = Sample2_5.luckyNumber;
        Sample2_5.getTripleNumber(num); // => 今日のラッキーナンバーは7です
    }

    static int luckyNumber = 7;

    static void getTripleNumber(int num) {
        System.out.println("今日のラッキーナンバーは" + num + "です");
    }
}
