import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        for(int i=0; i<num.length; i++){
            num[i]=sc.nextInt();
        }

        for(int i=0; i<num.length; i++){
            sum += num[i] * num[i];               
        }

        //System.out.println(sum);     
        int res = sum % 10;
       
        System.out.println(res);   
    }
}
