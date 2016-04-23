import Methods.Methods;

import java.io.*;

/**
 * Created by Алексей on 23.04.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите 1 для заполнения статистических данных");
            System.out.println("Введите 2 для вывода данных");
            System.out.println("Введите 3 для выхода из программы");

            //Ввод команды
            int command = Methods.getInput();
            if (command == 3) {
                break;
            }

            //Вветка ввода
            if (command == 1) {
                while (true) {
                    System.out.print("Введите 1 для выбора существующего дня либо 2 для создания нового: ");
                    int day = Methods.getDay();

                    if (day == 2) {
                        System.out.println("Введите день: ");
                        String fileName = in.readLine();
                        File newFile = new File("/" + fileName + ".txt");
                        if (newFile.createNewFile()) {
                            System.out.println("Новый файл создан");
                        } else {
                            System.out.println("Файл уже существует");
                        }
                    }

                    if (day == 1) {
                        System.out.println("Введите день: ");
                        String fileName = "/" + in.readLine() + ".txt";
                        File newFile = new File(fileName);
                        Methods.createStat(newFile);
                        break;
                    }
                }
            }
        }
    }
}

