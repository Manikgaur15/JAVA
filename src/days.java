import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int i = sc.nextInt();
        int days= i%30;
        int months=i/30;
        System.out.println(i + "days =" + months +"months" + days +"days");

    }
}
