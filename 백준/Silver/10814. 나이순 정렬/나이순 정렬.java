import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int n = sc.nextInt();
        String[][] arr = new String[n][2];

        for(int i=0; i<n;i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
    
        Arrays.sort(arr,new Comparator<String[]>() {
            @Override
            public int compare(String[] s1,String[] s2){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
            
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}