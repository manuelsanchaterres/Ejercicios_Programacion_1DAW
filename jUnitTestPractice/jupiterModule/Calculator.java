package jupiterModule;

public class Calculator {
    private static int result;

    Calculator(){};

    int add(int number1, int number2){

        result = number1 + number2;

        return result;

    }
}
