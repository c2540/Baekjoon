import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n=sc.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int number){
        if(number == 0)
            return 0;
        else if(number == 1)
            return 1;
        else
            return fibo(number-1)+fibo(number-2);
    }
}