public class Exercise1_2_Main {
    public static void main(String[] args) {
        Account acc = new Account("Anders", 123456L, 1000.0);
        long accNo = acc.getAccNum();
        System.out.println("account number: " + accNo);
        System.out.println(acc.toString());
    }
}
