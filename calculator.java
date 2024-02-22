import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your first number (x) = ");
        float x = sc.nextInt();
        System.out.println();
        System.out.print("Enter your second number (y) = ");
        float y = sc.nextInt();
        System.out.println();

        float add = x+y;

        float sub1 = x-y;
        float sub2 = y-x;

        float mul = x*y;
        
        float div1 = x/y;
        float div2 = y/x;

        float mod1 = x%y;
        float mod2 = y%x;

        float pow1 = 1;
        for(int i=0; i<y; i++){
            pow1 *= x;
        }

        float pow2 = 1;
        for(int i=0; i<x; i++){
            pow2 *= y;
        }

        System.out.println("The value of (x+y) is "+add);
        System.out.println();
        System.out.println("The value of (x-y) is "+sub1);
        System.out.println();
        System.out.println("The value of (y-x) is "+sub2);
        System.out.println();
        System.out.println("The value of (x*y) is "+mul);
        System.out.println();
        System.out.println("The value of (x/y) is "+div1);
        System.out.println();
        System.out.println("The value of (y/x) is "+div2);
        System.out.println();
        System.out.println("The value of (x%y) is "+mod1);
        System.out.println();
        System.out.println("The value of (y%x) is "+mod2);
        System.out.println();
        System.out.println("The value of (x power by y) is "+pow1);
        System.out.println();
        System.out.println("The value of (y power by x) is "+pow2);
        System.out.println();

        
    }
}