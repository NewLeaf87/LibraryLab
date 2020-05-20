public class anthology extends book {

    private int numOfBooks;

    public anthology(String title, int pages, boolean coverArt, String author, int yearsOld, int numOfBooks) {
        super(title, pages, coverArt, author, yearsOld);
        this.numOfBooks = numOfBooks;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    
    
}