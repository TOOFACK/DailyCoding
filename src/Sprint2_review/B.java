package Sprint2_review;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int x = in.nextInt();
        int[] mas = new int[temp];
        for(int i =0; i < temp; i++) {
            mas[i] = in.nextInt();

        }
        System.out.println(search(mas,x));
    }

    public static int search(int a[], int x) {
        return search(a, 0, a.length - 1, x);
    }

    public static int search(int a[], int left, int right, int x) {
        int mid = (left + right) / 2;
        if (x == a[mid]) { // Элемент найден
            return mid;
        }
        if (right < left) {
            return -1;
        }

        /* Либо левая, либо правая половина должна быть нормально упорядочена .
         * Найти нормально упорядоченную сторону, а затем использовать ее
         * для определения стороны, в которой следует искать х. */
        if (a[left] < a[mid]) { // Левая половина нормально упорядочена .
            if (x >= a[left] && x < a[mid]) {
                return search(a, left, mid - 1, x);// Искать слева
            } else {
                return search(a, mid + 1, right, x);// Искать справа
            }
        } else if (a[mid] < a[left]) { // Правая половина нормально упорядочена.
            if (x > a[mid] && x <= a[right]) {
                return search(a, mid + 1, right, x); // Искать справа
            } else {
                return search(a, left, mid - 1, x); // Искать слева
            }
        } else if (a[left] == a[mid]) { // Левая половина состоит из повторов
            if (a[mid] != a[right]) { // Если правая половина отличается, искать в ней
                return search(a, mid + 1, right, x);// Искать справа
            } else { // Иначе искать придется в обеих половинах
                int result = search(a, left, mid - 1, x); // Искать слева
                if (result == -1) {
                    return search(a, mid + 1, right, x); // Искать справа
                } else {
                    return result;
                }
            }
        }
        return -1;
    }
}
