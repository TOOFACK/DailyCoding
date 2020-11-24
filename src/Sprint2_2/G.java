package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class G {


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());



//        String a = lines.get(0);
        String a = in.next();
       int end = a.charAt(0);
       int start = 97;
//       while(start != end){
//           System.out.print(((char) start) + " ");
//           start++;
//       }
//        System.out.print((char) end);
        System.out.println(alphabet(end));

    }

    public static char alphabet(int end){
        int start = 97;
        if(start == end){
            System.out.println();
            return (char) end;
        } else{
            return alphabet(end-1);
        }
    }


}
