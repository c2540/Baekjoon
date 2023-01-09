import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int [n][m];

        for(int k=0; k<2; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++ ){
                    arr[i][j]+=sc.nextInt();
                }
            }
        }

        //System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}