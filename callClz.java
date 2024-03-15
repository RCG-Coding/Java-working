import java.util.Scanner;

class Add{
    public void add(float x, float y){
        float result1 = x + y;
        int result2 =(int) (x + y);
        System.out.println("The first answer is "+ result1);
        System.out.println("The second answer is "+ result2);
    }
}

public class callClz{

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter your second number : ");
        float num2 = sc.nextFloat();

        Add ad = new Add();
        ad.add(num1, num2);
    }
}