import java.util.Scanner;
import java.time.LocalDate;

public class NID{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your National ID number : ");
        String id = sc.nextLine();

        if(id.length() == 10){
            System.out.println();
            
            String str1 = "19";
            for(int i=0; i<2; i++){
                str1 += id.charAt(i);
            }

            String str2 = "";
            for(int i=2; i<5; i++){
                str2 += id.charAt(i);
            }

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            if(num2 < 500){
                System.out.println("This is an old national ID number");

                if(num2 <= 31){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Januery"+"-"+num2);
                }else if(num2 <= 60){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Februery"+"-"+(num2-31));
                }else if(num2 <= 91){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"March"+"-"+(num2-60));
                }else if(num2 <= 121){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"April"+"-"+(num2-91));
                }else if(num2 <= 152){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"May"+"-"+(num2-121));
                }else if(num2 <= 182){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Juny"+"-"+(num2-152));
                }else if(num2 <= 213){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"July"+"-"+(num2-182));
                }else if(num2 <= 244){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"August"+"-"+(num2-213));
                }else if(num2 <= 274){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"September"+"-"+(num2-244));
                }else if(num2 <= 305){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Octhomber"+"-"+(num2-274));
                }else if(num2 <= 335){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"November"+"-"+(num2-305));
                }else if(num2 <= 366){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"December"+"-"+(num2-335));
                }

                System.out.println("Your gender is Male");

                LocalDate currentDate = LocalDate.now();
                int currentYear = currentDate.getYear();
                System.out.println("Your age is : "+(currentYear - num1));

            }else if(num2 < 867){
                System.out.println("This is an old national ID number");

                if(num2 <= 531){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Januery"+"-"+(num2-500));
                }else if(num2 <= 560){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Februery"+"-"+(num2-531));
                }else if(num2 <= 591){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"March"+"-"+(num2-560));
                }else if(num2 <= 621){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"April"+"-"+(num2-591));
                }else if(num2 <= 652){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"May"+"-"+(num2-621));
                }else if(num2 <= 682){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Juny"+"-"+(num2-652));
                }else if(num2 <= 713){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"July"+"-"+(num2-682));
                }else if(num2 <= 744){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"August"+"-"+(num2-713));
                }else if(num2 <= 774){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"September"+"-"+(num2-744));
                }else if(num2 <= 805){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Octhomber"+"-"+(num2-774));
                }else if(num2 <= 835){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"November"+"-"+(num2-805));
                }else if(num2 <= 866){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"December"+"-"+(num2-835));
                }

                System.out.println("Your gender is Female");

                LocalDate currentDate = LocalDate.now();
                int currentYear = currentDate.getYear();
                System.out.println("Your age is : "+(currentYear - num1));

            }else{
            System.out.println("Invalied national ID number you entered");
            }

        }else if(id.length() == 12){
            System.out.println();
            
            String str1 = "";
            for(int i=0; i<4; i++){
                str1 += id.charAt(i);
            }

            String str2 = "";
            for(int i=4; i<7; i++){
                str2 += id.charAt(i);
            }

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            if(num2 < 500){
                System.out.println("This is a new national ID number");

                if(num2 <= 31){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Januery"+"-"+num2);
                }else if(num2 <= 60){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Februery"+"-"+(num2-31));
                }else if(num2 <= 91){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"March"+"-"+(num2-60));
                }else if(num2 <= 121){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"April"+"-"+(num2-91));
                }else if(num2 <= 152){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"May"+"-"+(num2-121));
                }else if(num2 <= 182){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Juny"+"-"+(num2-152));
                }else if(num2 <= 213){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"July"+"-"+(num2-182));
                }else if(num2 <= 244){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"August"+"-"+(num2-213));
                }else if(num2 <= 274){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"September"+"-"+(num2-244));
                }else if(num2 <= 305){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Octhomber"+"-"+(num2-274));
                }else if(num2 <= 335){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"November"+"-"+(num2-305));
                }else if(num2 <= 366){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"December"+"-"+(num2-335));
                }

                System.out.println("Your gender is Male");

                LocalDate currentDate = LocalDate.now();
                int currentYear = currentDate.getYear();
                System.out.println("Your age is : "+(currentYear - num1));

            }else if(num2 < 867){
                System.out.println("This is a new national ID number");
                
                if(num2 <= 531){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Januery"+"-"+(num2-500));
                }else if(num2 <= 560){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Februery"+"-"+(num2-531));
                }else if(num2 <= 591){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"March"+"-"+(num2-560));
                }else if(num2 <= 621){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"April"+"-"+(num2-591));
                }else if(num2 <= 652){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"May"+"-"+(num2-621));
                }else if(num2 <= 682){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Juny"+"-"+(num2-652));
                }else if(num2 <= 713){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"July"+"-"+(num2-682));
                }else if(num2 <= 744){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"August"+"-"+(num2-713));
                }else if(num2 <= 774){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"September"+"-"+(num2-744));
                }else if(num2 <= 805){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"Octhomber"+"-"+(num2-774));
                }else if(num2 <= 835){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"November"+"-"+(num2-805));
                }else if(num2 <= 866){
                    System.out.println("Your Birthday is : "+ num1 + "-" +"December"+"-"+(num2-835));
                }

                System.out.println("Your gender is Female");

                LocalDate currentDate = LocalDate.now();
                int currentYear = currentDate.getYear();
                System.out.println("Your age is : "+(currentYear - num1));

            }else{
            System.out.println("Invalied national ID number you entered");
            }

        }else{
            System.out.println();
            System.out.println("Invalied national ID number you entered");
            System.out.println("Length of the national ID number is not correct");
        }

    }
}