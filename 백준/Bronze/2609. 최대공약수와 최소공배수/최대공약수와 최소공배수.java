import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        
        int n=sc.nextInt();
        int m=sc.nextInt();

        int g = gcd(n,m);

        System.out.println(g);  //최대공약수
        System.out.println(n*m/g);  //최소공배수
    }

    public static int gcd(int n, int m){
        if(m==0){
            return n;
        }
        else{
            return gcd(m, n%m);
        }
    }
}