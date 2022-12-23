import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;    //소수개수

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int j = 2;
            for(j=2; j<num ; j++){
                if(num%j == 0)
                    break;        
            }
            if(num == j)
                cnt++;
        }
        System.out.println(cnt);
    }
}
