    package Sprint2_2;

    import java.util.Arrays;
    import java.util.Scanner;

    public class N {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int[] mas = (gcdex(a, b));
            Arrays.sort(mas);
            for(int s: mas){
                System.out.print(s+" ");
            }
            while(b != 0){

            }
        }

        static int[] gcdex(int a,int b) {
            if (b == 0) {
                return new int[]{a, 1, 0};
            } else {
                int[] mas = gcdex(b, a % b);
                int d = mas[0];
                int x = mas[1];
                int y = mas[2];


                return new int[] { d, y, x - y * (a / b) };
            }
        }
        }


