import java.util.*;

public class SetMatrixZeroesB{
    public static void setMatrix(int[][] arr, int m, int n,int[]row, int[] col){
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
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
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int[] row = new int[m];
        int[] col = new int[n];

        setMatrix(arr, m, n, row, col);
        printArray(arr, m, n);

    }
}