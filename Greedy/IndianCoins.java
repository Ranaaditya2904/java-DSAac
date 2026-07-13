package Greedy;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        int amt = 1920;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amt){
                while(coins[i]<=amt){
                    count++;
                    list.add(coins[i]);
                    amt -= coins[i];

                }
            }
        }

        System.out.println("Min coins/notes needed:"+count);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

    }
}
