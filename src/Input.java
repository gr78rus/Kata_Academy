public class Input {

    static boolean testInput(String s){

        int countChar = 0;
        int posChar = 0;

        for(int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                countChar++;
                posChar = i;
            }
        }
        return countChar == 1 && !s.substring(0, posChar).isEmpty() && !s.substring(posChar+1).isEmpty();
        }

    static boolean arab(String s) {
        String[] arabNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        boolean resArab = false;
        for (String arabNumber : arabNumbers) {
            if (s.equals(arabNumber)) {
                resArab = true;
                break;
            }
        }
        return resArab;
    }

    static boolean rome(String s) {
        String[] romeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean resRome = false;
        for (String romeNumber : romeNumbers) {
            if (s.equals(romeNumber)) {
                resRome = true;
                break;
            }
        }
        return resRome;
    }

}