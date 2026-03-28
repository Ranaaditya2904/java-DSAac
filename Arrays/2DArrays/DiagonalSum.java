import java.util.*;

public class DiagonalSum {
    public static int Dsum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum=sum+arr[i][i];
                if(i!=arr.length-1-i)
                    sum+=arr[i][arr.length-i-1];
            }
            return sum;
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int result=Dsum(arr);
        System.out.println("The sum is: "+result);

    }
}
