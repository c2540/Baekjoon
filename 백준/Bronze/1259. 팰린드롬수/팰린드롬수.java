import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        
        while(true){
            String num = sc.next();

            StringBuffer sb = new StringBuffer(num);
            String reverse = sb.reverse().toString();

            if(num.equals("0")){
                break;
            }

            if(num.equals(reverse)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}