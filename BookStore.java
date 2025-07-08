import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStore {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Book> it = inventory.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (currentYear - book.getYear() > maxAge) {
                System.out.println("🗑 Removed outdated book: " + book.title);
                it.remove();
            }
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                for (int i = 0; i < quantity; i++) {
                    if (!book.isAvailable()) {
                        throw new RuntimeException("Book not available: " + isbn);
                    }
                    book.processPurchase(email, address);
                }
                return;
            }
        }
        throw new RuntimeException("Book with ISBN " + isbn + " not found.");
    }

    public void printInventory() {
        System.out.println("📚 Current Inventory:");
        for (Book book : inventory) {
            System.out.println("- " + book.getClass().getSimpleName() + ": " + book.title);
        }
        System.out.println();
    }
}
