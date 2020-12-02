package Sprint6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int temp = Integer.parseInt(bf.readLine());
        boolean vseOk = false;
        for(int i =0; i < temp; i++){
            String subString = bf.readLine();

            if((line.contains(subString))) {
                line = line.replace(subString,"");
             }
            if(line.length() == 0){
                vseOk = true;
                break;
            }
        }

        System.out.println(vseOk ? "YES" : "NO");
    }
}
