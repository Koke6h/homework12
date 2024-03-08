public class Main {
    public static void main(String[] args) {
        Author murakami = new Author("Харуки", "Мкраками");
        Book book = new Book("1q84","Haruki Murakami",2009);
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book.getPages() = " + book.getYearOfPublication());
        book.setYearOfPublication(234234);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getYearOfPublication() = " + book2.getYearOfPublication());
        book2.setYearOfPublication(12122);
        System.out.println("book2.getYearOfPublication() = " + book2.getYearOfPublication());
    }
}