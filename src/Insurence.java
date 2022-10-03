import java.util.*;
public class Insurence {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String sex;
            String ms;
            int age;

            System.out.println ("Enter age:");
            age = in.nextInt();
            System.out.println("Enter your gender: M or F");
            sex = in.next();
            System.out.println("Enter your marital status: U or M");
            ms = in.next();

            if (ms=="M")

                System.out.println("The driver is insured");
            else
            {
                if (sex=="M")

                {
                    if (age>30)
                        System.out.println("The driver is insured");

                    else
                        System.out.println("The driver is not insured");
                }
                else
                {
                    if (age>25)
                        System.out.println("The driver is insured");
                    else
                        System.out.println("The driver is not insured");
                }
            }
        }
    }


