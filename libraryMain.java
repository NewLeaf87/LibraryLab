

public class libraryMain {
    
    public static void main(String[] args) {
        
        Book mybook = new Book("Naruto", 40, true, "Kimoto", 10);
        libraryItem myItem = new libraryItem("title", 100, false, "bob");
        
        mybook.display();
        System.out.println(mybook.getTitle());
        System.out.println(mybook.getAuthor());
        System.out.println(mybook.getPages());
        System.out.println(mybook.getYearsOld());
        System.out.println(mybook.isCoverArt());
        System.out.println(myItem.isCoverArt());

        

        
        
    }
}