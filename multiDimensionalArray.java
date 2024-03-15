public class multiDimensionalArray{
    public static void main(String args[]){
        System.out.println();
        int num[][] = new int[5][6];

        for(int i=0; i<5; i++){
            for(int j=0; j<6; j++){
                num[i][j] = (int)((Math.random() * 10) + 1);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        } 
        

    }
}