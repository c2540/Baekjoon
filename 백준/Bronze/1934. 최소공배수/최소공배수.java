import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int t=sc.nextInt();

        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int res = a*b / gcd(a,b);
            System.out.println(res);
        }
    }

    static int gcd(int n, int m){   //최대공약수
        if(m==0)
            return n;
        else
            return gcd(m, n%m);
    }
}