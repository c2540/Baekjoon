import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
                
        int[] cnt = new int[26]; 
        for(int i=0; i< str.length();i++){
            int tmp = str.charAt(i)-'A';
            cnt[tmp]++; 
        }
        
        //System.out.println(Arrays.toString(cnt));

        int max=0;
        char res='?';
        for(int i=0; i< cnt.length;i++){
            if(max<cnt[i]){
                max=cnt[i];
                res = (char)(i+'A');
            }
            else if(max == cnt[i]){
                res ='?';
            }
        }
        System.out.println(res);
    }
}
