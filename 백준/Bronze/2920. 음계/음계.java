import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Integer[] da = new Integer[8];

        for(int i=0; i<da.length; i++){
            da[i]=sc.nextInt();
        }
        Integer[] da2 = da.clone();
        Integer[] da3 = da.clone();
        Arrays.sort(da2);                               //da2 오름차순
        Arrays.sort(da3, Collections.reverseOrder());   //da3 내림차순

        // System.out.println(Arrays.toString(da));
        // System.out.println(Arrays.toString(da2));
        // System.out.println(Arrays.toString(da3));
        
        if(Arrays.equals(da, da2)){
            System.out.println("ascending");
        }
        else if(Arrays.equals(da, da3)){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}