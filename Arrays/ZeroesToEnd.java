/*public class ZeroesToEnd {
    public static void zeroesToEnd(int[] arr){
        int[] temp = new int[arr.length];

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }

        for(int i=0; i<temp.length; i++){
            arr[i]=temp[i];
        }
        int nz=temp.length;

        for(int i=nz; i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        zeroesToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/

// Optimal approach

public class ZeroesToEnd{
    public static void zeroesToEnd(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        zeroesToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
