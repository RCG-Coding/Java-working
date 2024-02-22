public class stars{
    public static void main(String args[]){
        System.out.println("Triangle");
        for(int i=0; i<10; i++){
            for(int j=9-i; j>0; j--){
            System.out.print(" ");
            }
            for(int k=0; k<(2*i+1); k++){
            System.out.print('*');
            } 
             System.out.println();   
        }
        System.out.println();
        System.out.print("Square");
        System.out.println();

        for(int i=0; i<5; i++){
            for(int j=0; j<12; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Rectangle");
        System.out.println();

        for(int i=0; i<5; i++){
            for(int j=0; j<30; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Mines triangle");
        System.out.println();

        for(int i=0; i<10; i++){
            for(int j=9-i; j>=0; j--){
            System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
            System.out.print('*');
            } 
             System.out.println();   
        }

        System.out.println();
        System.out.print("Plus triangle");
        System.out.println();

        for(int i=0; i<10; i++){
            for(int j=0; j<=i; j++){
            System.out.print('*');
            } 
             System.out.println();   
        }

        System.out.println();
        System.out.print("diament");
        System.out.println();

        for(int i=0; i<10; i++){
            for(int j=9-i; j>0; j--){
            System.out.print(" ");
            }
            for(int k=0; k<(2*i+1); k++){
            System.out.print('*');
            } 
             System.out.println();   
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<=i; j++){
            System.out.print(" ");
            }
            for(int k=0; k<(2*(8-i)+1); k++){
            System.out.print('*');
            } 
             System.out.println();   
        }

    }
}