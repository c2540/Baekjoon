import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        int n=sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll();
            int num = queue.poll();
            queue.add(num);

        }
        System.out.println(queue.poll());
    }
}