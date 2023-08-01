import java.util.*;


public class InfixToPostfix {

    static int prec(char ch){
        switch(ch){

            case '+':
            case '-':

                return 1;
            
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }


    public static String infixToPostfix(String prefix_exp){
        Stack<Character> s=new Stack<>();

        String result=new String(" ");

        for(int i=0;i<prefix_exp.length();i++){

            //fetch the character

            char currentChar=prefix_exp.charAt(i);


            

            //if character is operand then push into the stack

            if(Character.isLetterOrDigit(currentChar)){
                result+=currentChar;
            }




            //if character is opening bracket then push the character into the stack
            else if(currentChar == '('){
                s.push('(');
            }



            //if character is closing bracket then pop from the stack unless s.peek() != '('
            else if(currentChar == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    result+=s.pop();

                }

                s.pop();

            }




            // if character is operator then check the precedence and compare it and pop till the top
            //  of stack has higher precedence then the current character and once the top of the stack 
            //  has lower precedence then the current character then push the char into the stack 

            else{
                while(!s.isEmpty() && prec(s.peek()) >= prec(currentChar) ){
                    result += s.pop();

                }

                s.push(currentChar);


            }
            
        }
        
        //once the string is traversed completely then keep poping the character from the stack


        while( !s.isEmpty() ){
            result+=s.pop();
        }




        return result;
    }



    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("infix expression: "+exp);

        
        
        // Function call
      System.out.println("postfix expression: "+infixToPostfix(exp));
    }
    
}
