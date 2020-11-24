    package Sprint2_2;

    import java.util.Scanner;

    public class K {
        public static void main(String[] args) {

            float left = (float) 0.0; // 0^2 < 2, а значит f(0) = 0
            float right = (float) 10.0; // 10^2 > 2, а значит f(10) = 1
            for (int i = 0; i < 100; i++) {
               float middle =  ((left + right) / 2); //теперь деление не нацело, а вещественное

                if (Math.pow(middle,2) > 2) {
                    right = middle; //right всегда должна указывать на 1
                }else {
                    left = middle; //left всегда должна указывать на 0
                }
            }
            System.out.printf("%.5f%n", left);
        }
    }
