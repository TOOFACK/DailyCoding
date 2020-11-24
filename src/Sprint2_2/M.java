    package Sprint2_2;

    import java.io.IOException;
    import java.nio.charset.Charset;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.List;
    import java.util.Scanner;

    public class M {
        public static void main(String[] args) throws IOException {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
            int a = Integer.parseInt(lines.get(0));
            int b = Integer.parseInt(lines.get(1));
            while(a != b){
                if(a > b){
                    a = a-b;
                }else{
                    b = b -a;
                }
            }
            System.out.println(a);
        }
    }
