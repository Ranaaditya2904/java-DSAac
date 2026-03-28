import java.util.*;
//public package Arrays;

class linearSearch {
    public static int Lsearch(String dish[],String key){
        for(int i=0;i<dish.length;i++){
            if(dish[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String dish[]={"Samosa","bada","aluchop","patties"};
        String key="bada";

        int result=Lsearch(dish, key);
        if(result==-1)
            System.out.println("Not found");
        else
            System.out.println("found at "+result);

    }
}