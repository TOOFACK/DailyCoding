package Sprint8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/pavel/input.txt"));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        PrintWriter out = new PrintWriter(System.out);

        int temp = Integer.parseInt(st.nextToken());
        int[] mas = new int[temp];
        int[] dp = new int[temp];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i =0; i < temp; i++){
            mas[i] = Integer.parseInt(st.nextToken());
        }


        dp[0] = 1;
        for(int i =1; i < temp; i++){
            int max = -1;
            int maxIndex = i;
            for(int j = 0; j < temp; j++ ){
                if(mas[j] < mas[i]){
                    if(dp[j] > max){
                        max = dp[j];
                        maxIndex = j;
                    }
                }
            }


            dp[i]= dp[maxIndex] + 1;
        }

//        System.out.println(Arrays.toString(dp));

        int max = Arrays.stream(dp).max().getAsInt();
        out.println(max);
        int[] ans = new int[max];

        int i = 0;
        int index = 0;
        for(int j =0; j < dp.length; j++ ){
            if(dp[j] == max){
                index = j;
                break;
            }
        }
//        System.out.println(Arrays.toString(mas));
        ans[0] = index+1;
        int curMax = 0;

        while(i < ans.length-1){

            i++;
            int tempIndex = 0;
//            System.out.println("curr = " + mas[index]);
            for(int j = 0; j < index; j++ ){
                if(mas[j] < mas[index]){
//                    System.out.println("elem = " + mas[j]);
//                    System.out.println("dp[j] = " + dp[j]);
                    if(dp[j] > curMax){
                        curMax = dp[j];
                        tempIndex = j;
                    }
                }
            }
            index = tempIndex;
//            System.out.println(mas[index]);

            ans[i] = index+1;
            curMax = 0;
        }

        for(int j = ans.length-1; j >= 0; j--){
            out.print(ans[j] + " ");
        }
        out.flush();
    }
}
