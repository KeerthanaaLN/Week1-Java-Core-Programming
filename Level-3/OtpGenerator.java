import java.util.Arrays;

public class OtpGenerator {

    public static int[] getRandomNumbers() {
        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            int otp;
            do {
                otp = 100000 + (int) (Math.random() * 900000);;
            } while (isUnique(randomNumbers, otp, i)); 
            randomNumbers[i] = otp;
        }

        return randomNumbers;
    }

    public static boolean isUnique(int[] array, int num, int limit) {
        for (int i = 0; i < limit; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] otpNumbers = getRandomNumbers();
        System.out.println("Generated OTPs: " + Arrays.toString(otpNumbers));
    }
}
