import java.util.Scanner;

public class divisor {

    public static void main(String[] args) {
        int num, i;
        System.out.print("Enter a number: ");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        a.close();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.print(" are all the possible divisors.");
    }
}

