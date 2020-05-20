public class book extends libraryItem {

    private int yearsOld;

    public book(String title, int pages, boolean coverArt, String author, int yearsOld) {
        super(title, pages, coverArt, author);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    
    
}