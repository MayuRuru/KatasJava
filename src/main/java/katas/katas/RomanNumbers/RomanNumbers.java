package katas.katas.RomanNumbers;

public class RomanNumbers {

    public String passToRoman(int number) {
        switch (number) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if (number <= 3)
            return sumI(number);

        if (number <=8)
            return sumIfromV(number);

            return null;
        }
        private String sumI(int number) {
            String result = "";
            for (int i = 1; i <= number ; i++) {
                result += "I";
            } return result;
        }
        private String sumIfromV(int number) {
            String result = "V";
            for (int i = 6; i <= number; i++) {
                result += "I";
            } return result;
        }
    }

