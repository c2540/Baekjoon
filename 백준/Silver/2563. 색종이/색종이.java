import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n = sc.nextInt();
        int[][] arr = new int [100][100];
        int area = n*100;
        int cnt = 0;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=a; j<a+10 ;j++){
                for(int k=b; k<b+10 ;k++){
                    if(arr[j][k]==1){
                        cnt++;
                    }
                    arr[j][k]=1;
                }
            }
        }
        System.out.println(area-cnt);
    }
}