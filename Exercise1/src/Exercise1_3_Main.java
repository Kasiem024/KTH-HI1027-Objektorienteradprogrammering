public class Exercise1_3_Main {
    public static void main(String[] args) {
        Patient pat1 = new Patient("Kasiem","020312");

        System.out.println(pat1.toString());

        pat1.setJournal("Ny anteckning1 ");
        pat1.setJournal("Ny anteckning2 ");

        System.out.println(pat1.getJournal());
    }
}