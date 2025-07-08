public class PaperBook extends Book {
    private int quantity;

    public PaperBook(String isbn, String title, int year, double price, int quantity) {
        super(isbn, title, year, price);
        this.quantity = quantity;
    }

    @Override
    public boolean isAvailable() {
        return quantity > 0;
    }

    @Override
    public void processPurchase(String email, String address) {
        if (quantity <= 0) throw new RuntimeException("Out of stock.");
        quantity--;
        System.out.println("Paper book \"" + title + "\" shipped to " + address);
    }
}
