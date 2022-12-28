import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(black(arr,n,m));
    }

    public static int black(int[] arr, int n, int m){

        int res = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int tmp = arr[i] + arr[j] +arr[k];

                    if(tmp == m)
                        return tmp;
                    else if(res<tmp && tmp<m){
                        res = tmp;
                    }
                }
            }
        }
        return res;
    }
}