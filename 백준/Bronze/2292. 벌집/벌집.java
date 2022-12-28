import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();   

        int sn = 2;     //시작번호
        int cnt = 1;    //지나는 방

        if(n==1){
            System.out.println(cnt);
        }
        else{           //n>=2
            while(n >= sn){
                sn = sn + 6*cnt;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}