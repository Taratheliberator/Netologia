import java.util.Scanner;

public class Homework1 {

}

class Main {
    public static void main(String[] args) {
        System.out.println("������� ��� � ������� \"yyyy\"");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("���������� ���� 366");
        } else if (year % 100 == 0) {
            System.out.println("���������� ���� 365");
        } else if (year % 4 == 0) {
            System.out.println("���������� ���� 366");
        } else System.out.println("���������� ���� 365");
    }
}
