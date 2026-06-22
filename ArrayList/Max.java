package ArrayList;

import java.util.*;

public class Max {
    public static void main(String[] args){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7); 

        int maxVal=Integer.MIN_VALUE;
            for(int i=0;i<list.size();i++){
                if(list.get(i)>maxVal){
                    maxVal=list.get(i);
                }
                //maxVal=Math.max(maxVal,list.get(i));
            }
            System.out.println("Maximum is"+maxVal);
    }
}
