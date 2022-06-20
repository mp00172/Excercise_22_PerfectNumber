public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int sumDivisors = 0;
        for (int currentDivisor = 1; currentDivisor <= number; currentDivisor++) {
            if (number == currentDivisor) {
                continue;
            } else if (number % currentDivisor == 0) {
                sumDivisors += currentDivisor;
            }
        }
        return sumDivisors == number;

    }
}
