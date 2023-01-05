import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n=sc.nextInt();
        int k=sc.nextInt();

        int res = fac(n)/(fac(n-k)*fac(k));

        System.out.println(res);
    }

    public static int fac(int a){
        int i=1;
        for(int j=1; j<=a; j++){
            i*=j;
        }
        return i;
    }
}