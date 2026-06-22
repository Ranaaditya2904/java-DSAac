// import java.util.*;
// //public package Arrays;

// class linearSearch {
//     public static int Lsearch(String dish[],String key){
//         for(int i=0;i<dish.length;i++){
//             if(dish[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args){
//         String dish[]={"Samosa","bada","aluchop","patties"};
//         String key="bada";

//         int result=Lsearch(dish, key);
//         if(result==-1)
//             System.out.println("Not found");
//         else
//             System.out.println("found at "+result);

//     }
// }

import java.util.*;
public class linearSearch{
    public static int Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int key=7;
        int result=Search(arr,key);
        if(result==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at"+ result);
        }

    }
}