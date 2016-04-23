import java.io.*;
import Classes.*;

/**
 * Created by Алексей on 23.04.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите 1 для заполнения статистических данных, либо введите 2 для вывода: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int input;

        //Ввели команду с проверкой на корректность
        while (true) {
            try {
                input = Integer.parseInt(in.readLine());
                if ((input != 1) || (input != 2)) {
                    System.out.println("Введена некорректная команда");
                } else break;
            } catch (Exception e) {
                System.out.println("Введена некорректная команда");
            }
        }

        //Вветка ввода
        if (input == 1){
            System.out.println("");
        }
    }
}
