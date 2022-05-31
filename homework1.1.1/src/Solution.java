import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int earnings = 0;
        int spendings = 0;
        while (true) {
            System.out.println("�������� �������� � ������� � �����:");
            System.out.println("1. �������� ����� �����");
            System.out.println("2. �������� ����� ������");
            System.out.println("3. ������� ��c���� ���������������");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            int money;
            String moneyStr;
            switch (operation) {
                case 1:
                    System.out.println("������� ����� ������:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("������� ����� �������:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case 3:
                    taxCompare(taxEarningsMinusSpendings(earnings, spendings), taxEarningsOnly(earnings));
                    earnings = 0;
                    spendings = 0;
                    break;
                default:
                    System.out.println("����� �������� ���");
            }
        }
        System.out.println("��������� ���������!");
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarningsOnly(int earnings) {
        int tax2 = earnings * 6 / 100;
        return tax2;
    }

    public static void taxCompare(int tax, int tax2) {
        if (tax < tax2) {
            System.out.println("�� �������� ��� ��� ������ ����� �������");
            System.out.println("��� ����� ��������: " + tax);
            System.out.println("����� �� ������ �������: " + tax2);
            System.out.println("�������� " + (tax2 - tax));
        } else {
            System.out.println("�� �������� ��� ��� ������");
            System.out.println("��� ����� ��������: " + tax2);
            System.out.println("����� �� ������ �������: " + tax);
            System.out.println("�������� " + (tax - tax2));
        }
    }
}

