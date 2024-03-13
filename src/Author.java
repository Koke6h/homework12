import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String nameAuthor, String surnameAuthor) {
        this.name = nameAuthor;
        this.surname = surnameAuthor;
    }
    public String getName() {
        return this.name;
    }
    public String getSurnameAuthor() {
        return this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    public String toString(){
        return "Автор: "+ this.name+this.surname;
    }
}
