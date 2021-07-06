package codegym.collection.source.reverse.revchar;

import codegym.collection.source.*;

public class Reverse{

    private String in;
    private String out;

    public Reverse(String in){
        this.in = in;
    }

    public String doReverse(){
        GenericStack<Character> stack = new GenericStack<Character>();

        for(int i = 0; i < in.length(); i++){
            stack.push(in.charAt(i));
        }

        out = "";

        while(!stack.isEmpty()){
            char ch = stack.pop();
            out += ch;
        }
        return out;
    }
}
