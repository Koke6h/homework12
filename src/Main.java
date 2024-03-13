public class Main {
    public static void main(String[] args) {
        Author murakami = new Author("Харуки ", "Мкраками");
        Book book = new Book("1q84",murakami,2009);
        Author bulgakov = new Author("Михаил ", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", bulgakov, 1967);
        book.setYearOfPublication(234234);
        book2.setYearOfPublication(12122);
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book.equals(book2));
        System.out.println(book.hashCode());
    }
}