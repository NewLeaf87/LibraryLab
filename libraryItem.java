

public class libraryItem {

    private String title;
    private int pages;
    private boolean coverArt;
    private String author;

    public libraryItem(String title, int pages, boolean coverArt, String author) {
        this.title = title;
        this.pages = pages;
        this.coverArt = coverArt;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isCoverArt() {
        return coverArt;
    }

    public void setCoverArt(boolean coverArt) {
        this.coverArt = coverArt;

        if(coverArt = true) {
            System.out.println("This book has cover art");
        } else {
            System.out.println("This book does not have cover art");
        }
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    
    




    
}