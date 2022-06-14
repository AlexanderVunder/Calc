public class Test {
    public static void main(String[] args) {
        System.out.println(Test.calc("V * X"));

    }
    public static String calc(String input){
        String[] strings = input.split(" ");
        String symbol = strings[1];
        RomanNumbers[] roman = {RomanNumbers.I, RomanNumbers.II, RomanNumbers.III, RomanNumbers.IV,
                RomanNumbers.V, RomanNumbers.VI, RomanNumbers.VII, RomanNumbers.VIII, RomanNumbers.IX, RomanNumbers.X};

        int num1 = 0;
        int num2 = 0;
        int result;
        String resultS = null;

        if (strings[0].equals("1") || strings[0].equals("2") || strings[0].equals("3") || strings[0].equals("4") || strings[0].equals("5")
                || strings[0].equals("6") || strings[0].equals("7") || strings[0].equals("8") || strings[0].equals("9") || strings[0].equals("10") &&
                strings[2].equals("1") || strings[2].equals("2") || strings[2].equals("3") || strings[2].equals("4") || strings[2].equals("5")
                || strings[2].equals("6") || strings[2].equals("7") || strings[2].equals("8") || strings[2].equals("9") || strings[2].equals("10")) {
            int i = Integer.parseInt(strings[0]);
            int q = Integer.parseInt(strings[2]);
            if (i > 10 || q > 10) {
                throw new RuntimeException("Введеное число не может быть больше 10!");
            } else
                switch (symbol) {
                    case "+":
                        result = i + q;
                        resultS = Integer.toString(result);
                        return resultS;
                    case "-":
                        result = i - q;
                        resultS = Integer.toString(result);
                        return resultS;
                    case "*":
                        result = i * q;
                        resultS = Integer.toString(result);
                        return resultS;
                    case "/":
                        result = i / q;
                        resultS = Integer.toString(result);
                        return resultS;
                    default:
                        throw new RuntimeException("Введена неизвестная арифметическая операция");
                }
        } else {
            for (RomanNumbers romanNumbers : roman) {
                if (strings[0].equals(romanNumbers.getValueS())) {
                    num1 = romanNumbers.getValue();
                }
                if (strings[2].equals(romanNumbers.getValueS())) {
                    num2 = romanNumbers.getValue();
                }

            }
            if (num1 == 0 || num2 == 0) {
                throw new RuntimeException("Введеное число не может быть больше 10 или быть вещественным, либо введено неизвестное число (проверьте правильность ввода, римские цифры пишутся с большой буквы!)");
            }
        }
        switch (symbol) {
            case "+":
                result = num1 + num2;
                if (result <= 0) {
                    throw new RuntimeException("Результат не может быть равным или меньше 0!");
                }
                RomanNumbers romanNumbers = RomanNumbers.findNum(result);
                resultS = String.valueOf(romanNumbers);
                return resultS;
            case "-":
                result = num1 - num2;
                if (result <= 0) {
                    throw new RuntimeException("Результат не может быть равным или меньше 0!");
                }
                RomanNumbers romanNumbers1 = RomanNumbers.findNum(result);
                resultS = String.valueOf(romanNumbers1);
                return resultS;
            case "*":
                result = num1 * num2;
                if (result <= 0) {
                    throw new RuntimeException("Результат не может быть равным или меньше 0!");
                }
                RomanNumbers romanNumbers2 = RomanNumbers.findNum(result);
                resultS = String.valueOf(romanNumbers2);
                return resultS;
            case "/":
                result = num1 / num2;
                if (result <= 0) {
                    throw new RuntimeException("Результат не может быть равным или меньше 0!");
                }
                RomanNumbers romanNumbers3 = RomanNumbers.findNum(result);
                resultS = String.valueOf(romanNumbers3);
                return resultS;
            default:
                throw new RuntimeException("Введена неизвестная арифметическая операция");
        }
    }
}

