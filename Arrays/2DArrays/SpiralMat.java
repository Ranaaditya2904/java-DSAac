import java.util.Scanner;

public class SpiralMat{

    public static void printSpiral(int mat[][],int n,int m){
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=m-1;

        while(sr<=er && sc<=ec){
        //top
        for(int j=sc;j<=ec;j++){
            System.out.print(mat[sr][j]+" ");
        }
        //right
        for(int i=sr+1;i<=er;i++){
            System.out.print(mat[i][ec]+" ");
        }

        //bottom
        for(int j=ec-1;j>=sc;j--){
            if(sc==ec){
                return;
            }
            System.out.print(mat[er][j]+" ");
        }

        //left
        for(int i=er-1;i>sr+1;i--){
            System.out.print(mat[i][sc]+" ");
        }
         sc++;
        sr++;
        
        er--;
        ec--;
        }

       
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row & cols");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int mat[][]=new int[n][m];

        System.out.println("Enter elements into the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        printSpiral(mat,n,m);

    }
}