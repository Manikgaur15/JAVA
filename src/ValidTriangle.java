import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle 1");
        int a = sc.nextInt();
        System.out.println("Enter the angle 2");
        int b = sc.nextInt();
        System.out.println("Enter the angle 3");
        int c = sc.nextInt();
        int i = a + b + c;
        if (i == 180) {
            if (a > 0) {
                System.out.println(" Valid");

            }
            else {
                System.out.println("Not Valid");
            }
            if (b > 0) {
            } else {
                System.out.println("Not Valid");
            }
            if (c > 0) {
            } else {
                System.out.println("Not Valid");
            }
        } else {
            System.out.println("Not Valid");
        }
    }
}
