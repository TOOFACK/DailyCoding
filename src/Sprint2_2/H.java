    package Sprint2_2;

    import java.io.IOException;
    import java.nio.charset.Charset;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.List;
    import java.util.Scanner;

    public class H {
        public static void main(String[] args) throws IOException {
//            List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
            System.out.println(gen(3, 0,0,""));
        }

        public static String gen(int n, int counterOpen, int counterClose, String ans){
            if(counterOpen + counterClose == 2 *n){
                System.out.println(ans);
                return "";
            }
            if(counterOpen < n){
                gen(n, counterOpen+1,counterClose, ans + "(");
            }
            if(counterOpen > counterClose){
                gen(n, counterOpen, counterClose +1, ans + ")" );
            }
            return "";
        }

    }
