public class Converter {

    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romeToArab(String roman) {
        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (roman.startsWith(numerals[i])) {
                result += values[i];
                roman = roman.substring(numerals[i].length());
            }
        }
        return result;
    }

    private static final String[] numerals1 = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
    private static final int[] values1 = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};

    public static String arabToRome(int arab) {
        String result = "";
        String result1 = "";
        String result2 = "";

        for(int i = 0; i< values1.length; i++){
            if (arab == values1[i]){
                result = numerals1[i];
                }
            }
        if (result.equals("")){
            int a = (arab / 10) * 10;
            int b = arab % 10;
            for (int i = 0; i < values1.length; i++){
                if (a == values1[i]){result1 = numerals1[i];}
                if (b == values1[i]){result2 = numerals1[i];}
            }
            result = result1 + result2;
        }
        return result;
    }
}