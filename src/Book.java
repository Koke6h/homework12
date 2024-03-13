public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication < 2005 || yearOfPublication > 2012) {
            System.out.println("Invalid publishing year" + yearOfPublication);
        } else {
            System.out.println(yearOfPublication);
        }
        this.yearOfPublication = yearOfPublication;
    }
}
