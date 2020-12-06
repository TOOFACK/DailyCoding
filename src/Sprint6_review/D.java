package Sprint6_review;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class D {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        int [] pi = prefix_function(line);
        int k = line.length() - pi[line.length()-1];
        System.out.println(line.length()/k);

    }

    public  static  int[] prefix_function (String s) {
        int n =  s.length();
        int[] pi = new int[n];
        for (int i=1; i<n; ++i) {
            int j = pi[i-1];
            while (j > 0 && s.charAt(i) != s.charAt(j))
                j = pi[j-1];
            if (s.charAt(i) == s.charAt(j))  ++j;
            pi[i] = j;
        }
        return pi;
    }
}
