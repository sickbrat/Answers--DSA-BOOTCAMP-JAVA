package functions;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();
        even_odd(a);
    }
    static void even_odd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else System.out.println(num + " is Odd");
    }
}
