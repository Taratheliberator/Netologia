package Homework5;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("�.�. ������", "������� ������", 1997);
        Book book2 = new Book("�.�. �������", "���� ��������", 2000);
        Book book3 = new Book("���� ����", "���� �������� ������", 2022);

        System.out.println(book);
        book.isNewPublished();

        System.out.println(book2);
        book2.isNewPublished();

        System.out.println(book3);
        book3.isNewPublished();
    }
}
