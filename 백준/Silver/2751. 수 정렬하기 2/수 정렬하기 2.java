import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0 ; i<n ;i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);

        for(int i : list){
            sb.append(i).append('\n');
        }
        System.out.println(sb);

    }
}