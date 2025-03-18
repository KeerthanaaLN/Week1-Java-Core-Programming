import java.util.*;

class BasicCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number1 = in.nextFloat();
        float number2 = in.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        System.out.printf("The addition, subtraction, multiplication, and division of %.2f and %.2f is: %.2f, %.2f, %.2f, and %.2f%n",
                          number1, number2, addition, subtraction, multiplication, division);
    }
}
