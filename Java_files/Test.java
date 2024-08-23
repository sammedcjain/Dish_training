import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        //
        ArrayList<Character> stack=new ArrayList<>();
        ArrayList<Character> input=new ArrayList<>();
        input.add('(');input.add('(');input.add('{');input.add('}');
        input.add(')');input.add(')');
        ArrayList<Character> open=new ArrayList<>();
        open.add('(');open.add('{');open.add('<');open.add('(');
        ArrayList<String> valid=new ArrayList<>();
        valid.add("()");valid.add("{}");valid.add("[]");valid.add("<>");
        int flag=0;
        for(int i=0;i<input.size();i++){
            if(open.contains(input.get(i))){
                stack.add(input.get(i));
            }else{
                String temp= stack.get(stack.size()-1).toString()+input.get(i).toString();
                System.out.println(temp);
                stack.remove(stack.size()-1);
                if(valid.contains(temp)){
                    continue;
                }else{
                    flag=1;
                    break;
                }
            }
        }

        if(stack.size()!=0 || flag==1){
             flag=1;
            System.out.println("Not valid");
        }
        if(flag!=1){
            System.out.println("Valid");
        }

    }
}
