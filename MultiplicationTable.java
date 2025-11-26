// Program to print multiplication table of a number using for loop
class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
