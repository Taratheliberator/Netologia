package Homework5;

public class Book {
    String author;
    String name;
    int year;
    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }
    // Метод, который проверяет год издания.
    public void isNewPublished() {
        if (year == 2022) {
            System.out.println("Издание этого года");

        }
    }

    public String toString() {
        return "Автор: " + author + ", Название: " + name + ", Год издания: " + year;
    }
}



