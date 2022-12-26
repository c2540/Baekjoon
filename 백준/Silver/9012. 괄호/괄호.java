import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            System.out.println(vps(sc.next()));     
        }
    }

    public static String vps(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
            }
            else if(stack.empty()){     //pop사용전 비어있는지 확인
                return "NO";
            }
            else if(str.charAt(i) == ')'){
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";            
        }
        else{
            return "NO";
        }
    }
}