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
    // �����, ������� ��������� ��� �������.
    public void isNewPublished() {
        if (year == 2022) {
            System.out.println("������� ����� ����");

        }
    }

    public String toString() {
        return "�����: " + author + ", ��������: " + name + ", ��� �������: " + year;
    }
}



