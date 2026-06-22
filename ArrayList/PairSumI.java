package ArrayList;

import java.util.ArrayList;

public class PairSumI{
    public static String findTarget(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return (list.get(lp)+","+list.get(rp));
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=8;
        System.out.println(findTarget(list,target));
    }
}