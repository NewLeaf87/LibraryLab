

public class periodical extends libraryItem {

    private boolean monthly;

    public periodical(String title, int pages, boolean coverArt, String author, boolean monthly) {
        super(title, pages, coverArt, author);
        this.monthly = monthly;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public boolean setMonthly(boolean monthly) {
        return this.monthly = false;
    }

    
    
}