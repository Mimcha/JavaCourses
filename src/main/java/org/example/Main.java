package org.example;

import java.util.Scanner;

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Main {
        public static void main(String[] args) {
            String[] firstMas = new String[0];
            Scanner inMetod = new Scanner(System.in);
            System.out.println("Добро пожаловать в редактор ");
            System.out.println("1 - добавление записи. 2 - удаление записи. 3 - редактирование записи. 4 - просмотр записи. 5 - выход");
            System.out.print("Выбирите действие: ");
            int num = inMetod.nextInt();
            // выбор метода
            while (num < 5) {
                if (num == 1) {
                    firstMas = WritingNotebook.setSetWritingNotebook(addValue(firstMas));
                } else if (num == 2) {
                    firstMas = WritingNotebook.setSetWritingNotebook(delValue(firstMas));
                } else if (num == 3) {
                    firstMas = WritingNotebook.setSetWritingNotebook(readValue(firstMas));
                } else if (num == 4) {
                    printValue(WritingNotebook.getSetWritingNotebook());
                }

                //Повторный запрос
                System.out.println("Выбирите действие: ");
                System.out.println("1 - добавление записи. 2 - удаление записи. 3 - редактирование записи. 4 - просмотр записи. 5 - выход");
                num = inMetod.nextInt();
            }
            //выход
            System.out.print("Удачи!");
            inMetod.close();
        }

        //	методы:
        //Добавить запись,
        public static String[] addValue(String beginArr[]) {
            String[] inputArr = new String[1];
            Scanner inadd = new Scanner(System.in);
            System.out.print("Введите запись: ");
            String addVal = inadd.nextLine();
            inputArr[0] = addVal; // создать ввод
            String[] addArr = new String[beginArr.length + inputArr.length];
            System.arraycopy(beginArr, 0, addArr, 0, beginArr.length);
            System.arraycopy(inputArr, 0, addArr, beginArr.length, inputArr.length);
            return addArr;
        }


        //Удалить запись,
        //	выбрать запись,
        //	удалить
        public static String[] delValue(String beginArr[]) {
            Scanner inputKey = new Scanner(System.in);
            System.out.println("Введите номер записи");
            int inKey = inputKey.nextInt();
            // создать ввод ключа + проверка (цифры + попало в поле)
            String[] delArr = new String[beginArr.length - 1];
            for (int i = 0; i < beginArr.length; i++) {
                if (i < inKey) {
                    delArr[i] = beginArr[i];
                } else if (i > inKey) {
                    delArr[i - 1] = beginArr[i];
                }
            }
            return delArr;
        }

        //Редактировать запись,
        //	выбрать запись,
        //	Редактировать
        public static String[] readValue(String beginArr[]) {
            Scanner inputKey = new Scanner(System.in);
            Scanner inadd = new Scanner(System.in);
            //  ввод ключа + проверка (цифры + попало в поле массива)
            System.out.println("Введите номер записи");
            int inKey = inputKey.nextInt();
            System.out.print("Введите запись: ");
            String inputStr = inadd.nextLine();
            beginArr[inKey] = inputStr;
            return beginArr;
        }


        //Посмотреть все записи.
        //	Печать: ключ - значение
        public static String[] printValue(String beginArr[]) {
            if (beginArr == null) {
                System.out.println("Записи нет");
            } else {
                for (int i = 0; i < beginArr.length; i++) {
                    System.out.println("Номер записи[" + i + "]: " + beginArr[i]);
                }
            }
            return beginArr;
        }
    }