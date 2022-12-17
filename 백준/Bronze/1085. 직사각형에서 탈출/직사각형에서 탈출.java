import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[4];

        for(int i=0; i<4; i++){
        arr[i] = sc.nextInt();
        }

        int a = arr[0];
        int b = arr[1];
        int c = arr[2]-arr[0];
        int d = arr[3]-arr[1];
        
        int e = Math.min(a, b);
        int f = Math.min(c, d);
        int g = Math.min(e, f);

        System.out.println(g);

    }
}
