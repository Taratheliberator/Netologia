public class Book {
    String author;
    String name;
     int year;
     Book book = new Book("�.�. ������", "������� ������", 1997);
     Book book2 = new Book("�.�. �������", "���� ��������", 2000);
     Book book3 = new Book("���� ����", "���� �������� ������", 2022);

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public static void toString(Book item) {

        System.out.println("�����: " + item.author + ", ��������: " + item.name + ", ��� �������: " + item.year);

    }

    public static void main(String[] args) {
        Book item = book2;
        toString(item);
        NewPublished(item);
    }

    public static void NewPublished(Book item) {
        if (item.year == 2022) {
            System.out.println("������� ����� ����");

        }
    }
}



