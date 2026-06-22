import java.util.Scanner;

//package 2DArrays;

public class SetMatrixZeroes {
    public static void Matrix(int[][]arr, int r,int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               if(arr[i][j]==0){
                    markRow(arr,i,c);
                    markCol(arr,j,r);
               }
            }
        }
         for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]== -1){
                arr[i][j]=0;
            }
        }
    }

    }

    public static void markRow(int[][] arr,int r,int c){
        for(int j=0;j<c;j++){
            if(arr[r][j]!=0){
                arr[r][j]=-1;
            }
        }
    }

    public static void markCol(int[][] arr,int c, int r){
        for(int i=0;i<r;i++){
            if(arr[i][c]!=0){
                arr[i][c]=-1;
            }
        }
    }

   

    public static void printArray(int[][] arr, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }


        Matrix(arr,r, c);
        printArray(arr,r,c);
        
    }
}
