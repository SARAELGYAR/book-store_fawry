public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook(new PaperBook("111", "Java Basics", 2018, 50.0, 5));
        store.addBook(new EBook("222", "Python Guide", 2021, 30.0, "PDF"));
        store.addBook(new ShowcaseBook("333", "History Book", 2010));

        store.printInventory();
        store.removeOutdatedBooks(2025, 5);
        store.printInventory();

        store.buyBook("111", 1, "ahmed@example.com", "Cairo");
        store.buyBook("222", 1, "ahmed@example.com", "N/A");

        try {
            store.buyBook("333", 1, "ahmed@example.com", "Cairo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
