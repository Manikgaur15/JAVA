import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        Area obj = new Area();
        obj.Cir();
        obj.square();
        obj.triangle();


    }

    public void Cir()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        int a =sc.nextInt();
        double p = 3.14;
        double b = p*(a*a);
        System.out.println("Area of Circle is =" + b);

    }
    public void square(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int a =sc.nextInt();

        int b = (a*a);
        System.out.println("Area of Square is =" + b);

    }
    public void triangle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int b =sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();

        double A = 0.5 * (b*h);
        System.out.println("Area of Right angle Triangle is =" + A);
    }

}
