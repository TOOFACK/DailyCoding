package Sprint2_review;


import java.io.*;

import java.util.Arrays;


public class A {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            int temp = Integer.parseInt(bufferedReader.readLine());
            int[] data = new int[temp];
            int sum = 0;
            int copies = 0;
            int photo = 0;
            String[] mas1 = bufferedReader.readLine().split(" ");
            for (int i = 0; i < temp; i++) {
                data[i] = Integer.parseInt(mas1[i]);
                sum += data[i];
            }
            Arrays.sort(data);

            int min = 100000000;
            int max = -1;
            int indexMin = 0;
            int indexMax = data.length-1;


            int i = 0;
            if(temp > 1) {

                while (data[indexMax] != 0) {

//                for (int j = 0; j < temp; j++) {
//                    System.out.print(data[j] + " ");
//                }
//                System.out.println();

                    indexMin = i;
                if(indexMax == indexMin && indexMax== temp-1)
                    break;
                    while (data[indexMin] != 0) {
                        if (data[indexMax] < data[indexMax - 1])
                            break;
                        if (indexMax < data.length - 1) {
                            if (data[indexMax] < data[indexMax - 1] || data[indexMax] < data[indexMax + 1]) {
                                break;
                            }
                        }
//                    System.out.println("indexMax = " + indexMax);
//                    System.out.println("indexMin = " + indexMin);
                        data[indexMin]--;
                        data[indexMax]--;
                        if (data[indexMax] == -1)
                            break;
                        photo++;
//                    for (int j = 0; j < temp; j++) {
//                        System.out.print(data[j] + " ");
//                    }
//                    System.out.println();
                    }

                    for (int j = 0; j < temp; j++) {
                        if (max <= data[j]) {
                            max = data[j];
                            indexMax = j;
                        }
                    }
//                System.out.println("max = " + max);
                    if (max == 0) {
                        break;
                    }
                    max = -1;


                    if (data[i] == 0) {
                        i++;
                    }

                }

                System.out.println(photo);
            } else{
                System.out.println(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


