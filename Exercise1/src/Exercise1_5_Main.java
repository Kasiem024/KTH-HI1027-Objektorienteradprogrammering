public class Exercise1_5_Main {
    public static void main(String[] args) {

        Todo item = new Todo("Learn OOP", "Follow the lectures, read the textbook");
        System.out.println("last updated: " + item.getLastUpdated());
        System.out.println(item);

        // update the item
        item.setDesc(", do the exercises");
        System.out.println("last updated: " + item.getLastUpdated());
        System.out.println(item);

        Todo item2 = new Todo("Learn OOP", "Follow the lectures, read the textbook", Priority.HIGH);
        System.out.println("last updated: " + item2.getLastUpdated());
        System.out.println(item2);

        // update the item
        item2.setDesc(", do the exercises");
        System.out.println("last updated: " + item2.getLastUpdated());
        System.out.println(item2);
    }
}
