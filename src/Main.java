import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scan.nextLine().replaceAll("\\s","");
        String a = "";
        String b = "";
        String x = "";

        if(Input.testInput(input)) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                    a = input.substring(0, i);
                    b = input.substring(i+1);
                    x = input.substring(i, i+1);
                }
            }
        }
        else {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if(Input.arab(a) && Input.arab(b)){
            if(1<=Integer.parseInt(a) && Integer.parseInt(a)<=10 || 1<=Integer.parseInt(b) && Integer.parseInt(b)<=10){
                System.out.println(Calculate.calcArab(a,x,b));
            }
            else {
                System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно");
            }
        }
        else if(Input.rome(a) && Input.rome(b)){
            if(1<=Converter.romeToArab(a) && Converter.romeToArab(a)<=10 || 1<=Converter.romeToArab(b) && Converter.romeToArab(b)<=10){
                System.out.println(Calculate.calcRome(a,x,b));
            }
            else{
                System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно");
            }
        }
        else if(Input.rome(a) && Input.arab(b)){
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
        }
        else if(Input.arab(a) && Input.rome(b)){
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
        }
        else {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        }
    }
}