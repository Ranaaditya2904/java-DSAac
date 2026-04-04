package Recurssion.DividenConquer;

public class mergeSort {
    public static void Sort(int[] arr, int si,int ei){
        if(si>=ei){
            return;
        }
            int mid=si+(ei-si)/2;
            Sort(arr,si,mid);
            Sort(arr,mid+1,ei);
            Merge(arr,si,ei,mid);
    }

    public static void Merge(int[] arr,int si,int ei,int mid){
        int i =si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy arr to org

        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90,-2,-3,0};

        Sort(arr, 0, arr.length-1);
        //printArr(arr);

        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
