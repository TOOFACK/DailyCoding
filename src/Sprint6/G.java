package Sprint6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(bf.readLine());
        int startVal = (int) Math.pow(10,n-1);
        int endVal = (int) Math.pow(10,n);


        for(int i = startVal; i < endVal; i++){



            int sumC = 0;
            int sumN = 0;

            int tempVal = i;

            while(tempVal != 0){
                sumC+=tempVal%10;
                tempVal/=100;
            }
            tempVal = i;
            tempVal /= 10;

            while(tempVal != 0){
                sumN+=tempVal%10;
                tempVal/=100;
            }


            if(sumC == sumN){
                  out.println(i);
                  out.flush();
            }



        }
    }
}
