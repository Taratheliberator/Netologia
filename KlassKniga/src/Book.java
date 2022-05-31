public class Book {
    String author;
    String name;
     int year;
     Book book = new Book("А.С. Пушкин", "Евгений Онегин", 1997);
     Book book2 = new Book("Л.Н. Толстой", "Анна Каренина", 2000);
     Book book3 = new Book("Жюль Верн", "Дети капитана Гранта", 2022);

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public static void toString(Book item) {

        System.out.println("Автор: " + item.author + ", Название: " + item.name + ", Год издания: " + item.year);

    }

    public static void main(String[] args) {
        Book item = book2;
        toString(item);
        NewPublished(item);
    }

    public static void NewPublished(Book item) {
        if (item.year == 2022) {
            System.out.println("Издание этого года");

        }
    }
}



