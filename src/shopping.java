import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the quantity of item1");
        double i1 = sc.nextDouble();
        System.out.println("Enter the price of item1");
        double price1= sc.nextDouble();
        System.out.println("Enter the quantity of item2");
        double i2 = sc.nextDouble();
        System.out.println("Enter the price of item2");
        double price2= sc.nextDouble();
        System.out.println("Enter the quantity of item3");
        double i3 = sc.nextDouble();
        System.out.println("Enter the price of item3");
        double price3= sc.nextDouble();

        double quantity= i1+i2+i3;
        double Amount= price1+price2+price3;
        if (quantity>=10)
        {
            Amount= Amount-(Amount*0.1);
            System.out.println("total amount to be paid is :" + Amount);
        }
        else
        {
            System.out.println("total amount to be paid is:" + Amount);
        }

    }
}
