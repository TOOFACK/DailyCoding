package Sprint6;

import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line1 = bf.readLine();
        String line2 = bf.readLine();

        int wrongs = 0;

        if(line1.length() == line2.length()){
            for(int i =0; i < line1.length(); i++){
                if(line1.charAt(i) != line2.charAt(i)){
                    wrongs++;
                }
            }
        } else {

            if(line1.length() > line2.length()){
              int bIndex = 0;
              int lIndex = 0;

              while(bIndex < line1.length()){
                  if(line1.charAt(bIndex) != line2.charAt(lIndex)){
                      wrongs++;
                      bIndex++;
                  } else {
                      lIndex++;
                      bIndex++;
                  }
              }
            } else {

                int bIndex = 0;
                int lIndex = 0;

                while(bIndex < line2.length()){
                    if(line2.charAt(bIndex) != line1.charAt(lIndex)){
                        wrongs++;
                        bIndex++;
                    } else {
                        lIndex++;
                        bIndex++;
                    }
                }
            }
        }

        if(wrongs < 2){
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
