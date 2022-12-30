import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        int num=0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String str = sc.next();

            if(str.equals("push")){
                num = sc.nextInt();
                queue.add(num);
            }
            else if(str.equals("pop")){
                sb.append(queue.isEmpty()?-1:queue.poll()).append('\n');
                //System.out.println(queue.isEmpty()?-1:queue.poll());
            }   
            else if(str.equals("size")){
                sb.append(queue.size()).append('\n');
                //System.out.println(queue.size());
            }   
            else if(str.equals("empty")){
                sb.append(queue.isEmpty()?1:0).append('\n');
                //System.out.println(queue.isEmpty()?1:0);
            }   
            else if(str.equals("front")){
                sb.append(queue.isEmpty()?-1:queue.peek()).append('\n');
                //System.out.println(queue.isEmpty()?-1:queue.peek());
            }   
            else if(str.equals("back")){
                sb.append(queue.isEmpty()?-1:num).append('\n');
                //System.out.println(queue.isEmpty()?-1:num);
            }   
        }
        System.out.println(sb);
    }
}