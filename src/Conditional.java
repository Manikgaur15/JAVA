import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The first num ");
        int i= sc.nextInt();
        System.out.println("Enter second num");
        int j= sc.nextInt();
        if (i>j)
        {
            System.out.println(i+"is greater");
        }
        else
        {
            System.out.println(j+"is greater");
        }
    }
}
