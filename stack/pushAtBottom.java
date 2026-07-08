package stack;

import java.util.Stack;

public class pushAtBottom {
    public static void pushAtBot(Stack <Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBot(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBot(s,4);

    }
}
