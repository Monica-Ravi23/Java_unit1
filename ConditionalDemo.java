// Program to demonstrate if–else statement
class IfElseDemo {
    public static void main(String[] args) {
        int number = 10;

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}

// Program to demonstrate else–if statement
class ElseIfDemo {
    public static void main(String[] args) {
        int temperature = 25;

        // Programs to Demonstrate Conditional Statements in Java

        if (temperature > 35)
            System.out.println("It's too hot outside.");
        else if (temperature > 20)
            System.out.println("The weather is pleasant.");
        else
            System.out.println("It's quite cold.");
    }
}

// Program to demonstrate nested if–else statement
class NestedIfElseDemo {
    public static void main(String[] args) {
        int num = -5;

        if (num >= 0) {
            if (num == 0)
                System.out.println("Number is Zero");
            else
                System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}

// Program to demonstrate if–else ladder
class IfElseLadderDemo {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90)
            System.out.println("Grade: A+");
        else if (marks >= 80)
            System.out.println("Grade: A");
        else if (marks >= 70)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}
