// Program to find the sum of digits of a number using while loop
class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        int temp = num; // store original value

        while (temp > 0) {
            int digit = temp % 10;  // extract last digit
            sum += digit;           // add to sum
            temp /= 10;             // remove last digit
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}
