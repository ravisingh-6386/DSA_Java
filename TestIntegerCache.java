public class TestIntegerCache {
    public static void main(String[] args) {
        Integer a1 = 90;
        Integer a2 = 90;
        Integer a3 = 172;
        Integer a4 = 172;
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
    }
}
