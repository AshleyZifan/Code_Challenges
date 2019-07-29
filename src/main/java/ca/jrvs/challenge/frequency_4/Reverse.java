package ca.jrvs.challenge.frequency_4;

import java.util.Stack;

public class Reverse {

    //Given an input string, reverse the string word by word.
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<String>();
        String [] strs=s.split(" ");
        int n=strs.length;
        for(int i=0;i<n;i++){
            if(!strs[i].equals(""))
                stack.push(strs[i]);
        }
        StringBuilder builder=new StringBuilder();
        if(stack.isEmpty()) return "";
        builder.append(stack.pop());
        while(!stack.isEmpty()){
            builder.append(" "+stack.pop());
        }
        return builder.toString();
    }
}
