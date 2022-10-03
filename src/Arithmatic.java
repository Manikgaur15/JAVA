import java.util.Scanner;
public class Arithmatic {
    public void add()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println("Addition = " + result);
    }

    public int sub(int a , int b)
    {
        return (a-b);
    }
    public int mul()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter 2 more numbers");
        int num3= sc.nextInt();
        int num4 = sc.nextInt();

        int c= num3 * num4;
        return c;


    }
    public int div(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 more numbers");
        int num3= sc.nextInt();
        int num4 = sc.nextInt();
        int j= (num3/num4);
        return (j);
    }
    public int rem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 more numbers");
        int num3= sc.nextInt();
        int num4 = sc.nextInt();
        int k= (num3%num4);
        return (k);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arithmatic obj = new Arithmatic();
        // obj.add();

        System.out.println("Enter any two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // int result = ;
        System.out.println("Subtraction = " + obj.sub(num1, num2));
        System.out.println("mul of the numbers are " + obj.mul());
        System.out.println("div = " + obj.div());
        System.out.println("rem = " + obj.rem());

    }
}
