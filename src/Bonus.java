import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        int i = sc.nextInt();
        int n =i;
        double TA= n * 0.1;
        double DA= n * 0.15;
        double HRA= n * 0.20;
        double PF= n * 0.12;
        double j=0;
        if (i>=20000)
        {
            j= i + (i * 0.1);
            System.out.println("=10% bonus is alloted");
        }
        else {
            j = i + (i * 0.20);
            System.out.println("=20% bonus is alloted");
        }
        System.out.println("TA=" + TA);
        System.out.println("DA=" + DA);
        System.out.println("HRA=" + HRA);
        System.out.println("PF=" +PF);
        System.out.println("bonus value=" +j);
        double gross=i+TA+DA+HRA+j-PF;
        System.out.println("gross salary =" + gross);
    }
}
