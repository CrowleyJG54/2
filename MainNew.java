import java.util.ArrayList;
import java.util.Scanner;
public class MainNew {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);     // сканер для трансляции данных из консоли.
        System.out.println("Введите задачу");
        String input = sc.nextLine(); // сканирую строку в массив с разделением данных по пробелу

        System.out.println(calc(input));

    }

    public static String calc(String input) throws Exception {


        String[] strings = input.split(" ");
        if (strings.length <= 2) {
            throw new Exception("Строка не является математической операцией");
        }
        if (strings.length > 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }

        String a = strings [0];                              // переменная а - это значение ячейки с индексом 0 в массиве
        String operation = strings [1];                      // операция - это значение ячейки с индексом 1 в массиве
        String b = strings [2];                              // переменная b - это значение ячейки с индексом 2 в массиве


        ArrayList<String> oper = new ArrayList<>(); // строки для экстракции индекса операции
        oper.add("+");
        oper.add("-");
        oper.add("*");
        oper.add("/");



        if (a.contains("I") || a.contains("II") || a.contains("III") || a.contains("IV") || a.contains("V") || a.contains("VI") || a.contains("VII") || a.contains("VIII") || a.contains("IX") || a.contains("X")) {  // проверка на счисление первой переменной для запуска римского калькулятора


            // начало римского калькулятора
            ArrayList<String> rome = new ArrayList<>(); // строки для экстракции индекса цифр
            rome.add(" ");
            rome.add("I");
            rome.add("II");
            rome.add("III");
            rome.add("IV");
            rome.add("V");
            rome.add("VI");
            rome.add("VII");
            rome.add("VIII");
            rome.add("IX");
            rome.add("X");
            if (b.contains("1") || b.contains("2") || b.contains("3") || b.contains("4") || b.contains("5") || b.contains("6") || b.contains("7") || b.contains("8") || b.contains("9") || b.contains("10")){
                throw new Exception("Используются одновременно разные системы счисления"); // исключение по системам счисления рим + араб
            }

            int x = rome.indexOf(a);                      // перевожу введенные римские в арабский индекс строки
            int y = rome.indexOf(b);
            int operat = oper.indexOf(operation);


            String[] romeNumbers = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"}; // не массив, а МАССИВИЩЩЕ


            int sumRom = x + y;                              // арифметические операции
            int differenceRom = x - y;
            int multiplicationRom = x * y;
            int divisionRom = x / y;

            if ((operat == 1) && (differenceRom < 0)) {
                throw new Exception("В римской системе счисления нет отрицательных чисел");  // исключение на отрицательные значения в римских расчетах
            }


            if ((x == 0) || ( y == 0) || (x < 1) || (y < 1) || (x > 10) || (y > 10)) {
                throw new Exception ("Введите корректные данные");
            } else if (operat == 0) {
                String ansver = romeNumbers[sumRom];
                System.out.println(ansver);
            } else if (operat == 1) {
                String ansver = romeNumbers[differenceRom];
                System.out.println(ansver);
            } else if (operat == 2) {
                String ansver = romeNumbers[multiplicationRom];
                System.out.println(ansver);
            } else if (operat == 3) {
                String ansver = romeNumbers[divisionRom];
                System.out.println(ansver);
            }


        }
        // конец римского калькулятора
        // начало арабского калькулятора
        else if (a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9") || a.contains("10")) {
            if (b.contains("I") || b.contains("II") || b.contains("III") || b.contains("IV") || b.contains("V") || b.contains("VI") || b.contains("VII") || b.contains("VIII") || b.contains("IX") || b.contains("X")){
                throw new Exception("Используются одновременно разные системы счисления"); // исключение по системам счисления ар+рим
            }


            int x = Integer.parseInt(a);             // перевод стринг в инт
            int y = Integer.parseInt(b);             // перевод стринг в инт
            int operat = oper.indexOf(operation);


            int sumArab = x + y;                              // арифметические операции
            int differenceArab = x - y;
            int multiplicationArab = x * y;
            int divisionArab = x / y;

            if ((x == 0) || ( y == 0) || (x < 1) || (y < 1) || (x > 10) || (y > 10)) {
                throw new Exception ("Введите корректные данные");
            } else if (operat == 0) {
                String ansver = Integer.toString(sumArab);
            } else if (operat == 1) {
                String ansver = Integer.toString(differenceArab);
            } else if (operat == 2) {
                String ansver = Integer.toString(multiplicationArab);
            } else if (operat == 3) {
                String ansver = Integer.toString(divisionArab);
            }

        }

        return input;
    }


}

