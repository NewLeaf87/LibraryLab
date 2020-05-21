public class cardHolder {

    private String name;
    private int age;
    private int yearJoined;
    private boolean reserveBooks;
    private int checkOutBooks;

    public cardHolder(String name, int yearJoined, boolean reserveBooks, int checkOutBooks, int age) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.reserveBooks = reserveBooks;
        this.checkOutBooks = checkOutBooks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public boolean isReserveBooks() {
        return reserveBooks;
    }

    public void setReserveBooks(boolean reserveBooks) {
        this.reserveBooks = reserveBooks;
    }

    public int getCheckOutBooks() {
        return checkOutBooks;
    }

    public void setCheckOutBooks(int checkOutBooks) {
        this.checkOutBooks = checkOutBooks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}