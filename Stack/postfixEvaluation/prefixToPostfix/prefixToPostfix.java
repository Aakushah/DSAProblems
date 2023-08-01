import java.util.*;

public class prefixToPostfix {

    public static boolean isOperator(char c){

        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;

        }

        return false;
    }

    public static String preToPost(String pre_exp){
        
        int n=pre_exp.length();

        Stack<String> s =new Stack<>();

        //traversing the prefix string from right to left
        for(int i=n-1;i>=0;i--){

            if(isOperator(pre_exp.charAt(i))){

                String op1=s.pop();
                String op2=s.pop();

                String temp=op1 + op2 +pre_exp.charAt(i);

                s.push(temp);

            }

            else{
                s.push(pre_exp.charAt(i)+" ");
            }

        }






        return s.peek();
    }




    public static void main(String[] args) {

        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Postfix : "+ preToPost(pre_exp));



        
    }
    
}
