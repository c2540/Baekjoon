import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        
        int n=sc.nextInt();
        int k=sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1 ; i<=n; i++){
            queue.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size()>1){
            for(int i=0; i<k-1; i++){
                int num = queue.poll();
                queue.add(num);
            }

            sb.append(queue.poll()).append(", ");

        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
        
    }
}