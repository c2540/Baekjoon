import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);   

        int t=sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<t; i++){
            int cnt = 0;

            int h=sc.nextInt();
            int w=sc.nextInt();
            int n=sc.nextInt();

            for(int a=1;a<=w;a++){
                for(int b=1;b<=h;b++){
                    cnt++;

                    if(cnt == n){
                        if(a<10)
                            sb.append(b).append(0).append(a);
                        else
                            sb.append(b).append(a);
                        System.out.println(sb);
                        sb.setLength(0);
                    }    
                }  
            }
        }
    }
}