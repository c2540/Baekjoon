import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        while(true){
            String str = sc.nextLine();

            if(str.equals(".")){
                break;
            }            
            else
                System.out.println(balance(str));
        }
    }

    public static String balance(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '(' || c == '['){ 
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }

            else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
        }

        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}