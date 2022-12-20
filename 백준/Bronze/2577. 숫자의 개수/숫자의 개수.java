import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt()*sc.nextInt()*sc.nextInt();
        
        String str = Integer.toString(tmp); //문자열로 변환
        //System.out.println(str);

        for(int i=0; i<10 ;i++){
            int cnt = 0;
            for(int j=0; j<str.length() ;j++){
                if((str.charAt(j)-'0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
