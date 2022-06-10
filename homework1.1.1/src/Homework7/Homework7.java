package Homework7;

import java.util.Random;

public class Homework7 {
    static int SIZE = 8;
    static int[][] colors = new int[SIZE][SIZE];
    static int[][] rotatedColors = new int[SIZE][SIZE];
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        arrayPrinting(colors);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - 1 - j][i];
            }
        }

        arrayPrinting(rotatedColors);
    }

    public static void arrayPrinting(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

