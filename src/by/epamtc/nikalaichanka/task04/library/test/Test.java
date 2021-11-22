package by.epamtc.nikalaichanka.task04.library.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void task02() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[3];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
            }

        for (int i : mass) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }

        if (mass[0] == mass[1] && mass[0] == mass[2]) {
            System.out.print(mass[0]);
        } else {
            System.out.print(mass[1]);
        }
    }

    public static void task03() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        while (true) {
            int i = Integer.parseInt(reader.readLine());
            summ += i;
            if (i == -1) {
                break;
            }
        }

        System.out.print(summ);
    }
}

