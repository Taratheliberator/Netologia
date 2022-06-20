package Homework6;

import java.util.Scanner;

public class Homewok6 {

    public static void main(String[] args) {

        String[] products = {"����", "��� ���������", "������"};
        int[] prices = {35, 200, 60};
        for (int i = 0; i < products.length; i++) {
            System.out.format("%5s%16s%10d%7s\n", i + 1 + ".", products[i], prices[i], "���/��");
        }

        Scanner scanner = new Scanner(System.in);
        String input;
        int[] productCount = new int[products.length]; // ��c��� �� ���������� ������� ������ ���� ��������.
        int productNumber;
        int sumProducts = 0;

        while (true) {
            System.out.println("�������� ����� � ���������� ��� ������� `end`\n");
            input = scanner.next();
            if ("end".equals(input))
                break;
            productNumber = Integer.parseInt(input);
            productCount[productNumber - 1] = productCount[productNumber - 1] + Integer.parseInt(scanner.next());
        }
        System.out.format("%15s%13s%13s%18s\n", "������������", "����������", "����/��.��", "����� ���������");

        for (int i = 0; i < products.length; i++) {
//�������� ��������� �� ������� ��� ���
            if (productCount[i] != 0) {
                System.out.format("%15s%13d%13d%18d\n", products[i], productCount[i], prices[i], productCount[i] * prices[i]);
                sumProducts = sumProducts + productCount[i] * prices[i];
            }
        }
        System.out.format("%41s%18d", "�����", sumProducts);
    }
}
