package Sprint5;

import java.io.*;



public class I {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long a = Long.parseLong(br.readLine());
        long r = Long.parseLong(br.readLine());
        char[] input = br.readLine().toCharArray();
        br.close();
        hashPolinom(a,r,input);
    }



    public static long hashPolinom(long a, long m, char[] s){
        int sum = 0;
        long p = 1;
        for (int i = s.length - 1; i >= 0; i--) {
            sum += s[i] * p;
            p = (p * a) % m;
        }

        System.out.println(sum % m);

        return m;
    }
}
