
public class Book extends libraryItem implements BestSeller {

    private int yearsOld;

    public Book(String title, int pages, boolean coverArt, String author, int yearsOld) {
        super(title, pages, coverArt, author);
        this.yearsOld = yearsOld;
    }


    


	public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void display() {
        System.out.println("BestSeller");
    }

    
    
}