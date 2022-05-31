package Homework5;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("А.С. Пушкин", "Евгений Онегин", 1997);
        Book book2 = new Book("Л.Н. Толстой", "Анна Каренина", 2000);
        Book book3 = new Book("Жюль Верн", "Дети капитана Гранта", 2022);

        System.out.println(book);
        book.isNewPublished();

        System.out.println(book2);
        book2.isNewPublished();

        System.out.println(book3);
        book3.isNewPublished();
    }
}
