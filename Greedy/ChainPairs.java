package Greedy;
//Maximum length chain of pairs

import java.util.*;

public class ChainPairs {
    public static void main(String[] args) {
        int pairs[][] = {{1,2},{2,3},{3,4}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum length: "+chainLen);
    }    
}
