import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((int)Math.pow(2, n)-1);
        hanoi(n, 1, 3);
        System.out.println(sb);
    }


    public static void hanoi(int n, int x, int y){  //x 1번 장대,y 3번 장대
        if(n>1){
             hanoi(n-1, x, 6-x-y);
        }

        sb.append(x+" "+y+"\n");

        if(n>1) {
             hanoi(n-1, 6-x-y, y);
        }
    }
}
