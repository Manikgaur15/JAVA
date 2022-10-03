import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age ");
        int i= sc.nextInt();
        if (i>18)
        {
            System.out.println("Yes' you can vote");
        }
        else
        {
            System.out.println("No' you are not eligible.");
        }
    }
}
