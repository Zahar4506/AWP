package Methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
                    break;
                } else {
                    System.out.println("Введена некорректная команда\n");
                }

            } catch (Exception e) {
                System.out.println("Введена некорректная команда\n");
            }
        }
        return input;
    }
    public static void createStat(String fileName) {

    }
}

