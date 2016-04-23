package Methods;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Алексей on 23.04.2016.
 */
public class Methods {
    public static int getInput() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input;

        //Ввели команду с проверкой на корректность
        while (true) {
            try {
                input = Integer.parseInt(in.readLine());
                System.out.println("\n");

                if ((input == 1) || (input == 2) || (input == 3)) {
                    return input;
                } else {
                    System.out.println("Некорректный ввод\n");
                }

            } catch (Exception e) {
                System.out.println("Некорректный ввод\n");
            }
        }
    }

    public static int getDay() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input;

        //Ввели команду с проверкой на корректность
        while (true) {
            try {
                input = Integer.parseInt(in.readLine());
                System.out.println("\n");

                //Отличие от getInput - отсутствие варианта 3
                if ((input == 1) || (input == 2)) {
                    return input;
                } else {
                    System.out.println("Некорректный ввод\n");
                }

            } catch (Exception e) {
                System.out.println("Некорректный ввод\n");
            }
        }
    }

    public static void createStat(File file) throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(file);
        while(in.hasNextLine()) {
            s = in.nextLine();
            System.out.println(s);
        }
        in.close();

        System.out.println(s);
    }
}

