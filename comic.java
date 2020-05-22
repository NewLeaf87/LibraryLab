
public class comic extends periodical implements BestSeller {

    private int issues;

    public comic(String title, int pages, boolean coverArt, String author, boolean monthly, int issues) {
        super(title, pages, coverArt, author, monthly);
        this.issues = issues;
    }

    public int getIssues() {
        return issues;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    @Override
    public boolean setMonthly(boolean monthly) {
        return monthly = true;
    }

    @Override
    public void display() {
        System.out.println("Lets");
    }

    

    
    
}