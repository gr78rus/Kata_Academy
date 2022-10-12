public class Calculate {

    static int calcArab(String a, String x, String b){

        return switch (x.charAt(0)) {
            case '+' -> Integer.parseInt(a) + Integer.parseInt(b);
            case '-' -> Integer.parseInt(a) - Integer.parseInt(b);
            case '*' -> Integer.parseInt(a) * Integer.parseInt(b);
            case '/' -> Integer.parseInt(a) / Integer.parseInt(b);
            default -> 0;
        };
    }
    static String calcRome(String a, String x, String b){

        int result = switch (x.charAt(0)) {
            case '+' -> Converter.romeToArab(a) + Converter.romeToArab(b);
            case '-' -> Converter.romeToArab(a) - Converter.romeToArab(b);
            case '*' -> Converter.romeToArab(a) * Converter.romeToArab(b);
            case '/' -> Converter.romeToArab(a) / Converter.romeToArab(b);
            default -> 0;
        };

        if(result < 1){
            return "в римской системе нет отрицательных чисел";
        } else {
            return Converter.arabToRome(result);
        }
    }
}