package String;

public class LongestSubString {
    public static int FindLongest(String[] str){
        String longStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i).equals(str.charAt(i+1)))
                longStr+=str.charAt(i);
                break;
            longStr+=str.charAt(i);
        }
        return longStr;
    }
    public static void main(String[] args) {
        String str="Hello Everyone";
    }
}
