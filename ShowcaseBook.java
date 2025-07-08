public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year) {
        super(isbn, title, year, 0.0);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void processPurchase(String email, String address) {
        throw new RuntimeException("Showcase books are not for sale.");
    }
}
