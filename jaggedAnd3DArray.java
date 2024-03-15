public class jaggedAnd3DArray{
    public static void main(String args[]){

//jagged array
        int num[][] = new int[5][];  

        num[0] = new int[4];
        num[1] = new int[2];
        num[2] = new int[6];
        num[3] = new int[3];
        num[4] = new int[5];

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                num[i][j] = (int) (Math.random() * 100);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(); // for seperate the matrics

// 3D and jagged array

        int n[][][] = new int[3][][];
        n[0] = new int[4][];
        n[1] = new int[2][];
        n[2] = new int[3][];

        n[0][0] = new int[3];
        n[0][1] = new int[2];
        n[0][2] = new int[4];
        n[0][3] = new int[2];

        n[1][0] = new int[3];
        n[1][1] = new int[2];

        n[2][0] = new int[5];
        n[2][1] = new int[3];
        n[2][2] = new int[4];

        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                for(int k=0; k<n[i][j].length; k++){
                    n[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(n[i][j][k] + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}