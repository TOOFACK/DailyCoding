package Sprint1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {

            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> listAns = new ArrayList<>();


            String fNum = bufferedReader.readLine(); //читаем строку с клавиатуры

            char[] mas = fNum.toCharArray();

            for(int i =0; i < mas.length; i++){

                switch (mas[i]) {
                    case '2':
                        list.add("a");
                        list.add("b");
                        list.add("c");
                        break;
                    case '3':
                        list.add("d");
                        list.add("e");
                        list.add("f");
                        break;
                    case '4':
                        list.add("g");
                        list.add("h");
                        list.add("i");
                        break;
                    case '5':
                        list.add("j");
                        list.add("k");
                        list.add("l");
                        break;
                    case '6':
                        list.add("m");
                        list.add("n");
                        list.add("o");
                        break;
                    case '7':
                        list.add("p");
                        list.add("q");
                        list.add("r");
                        list.add("s");
                        break;
                    case '8':
                        list.add("t");
                        list.add("u");
                        list.add("v");
                        break;
                    case '9':
                        list.add("w");
                        list.add("x");
                        list.add("y");
                        list.add("z");
                        break;

                }


                if(i == 0){
                    listAns.addAll(list);
                } else{
                    int lenAns = listAns.size();
                    for(int j = 0; j < list.size(); j++){
                        for(int k = 0; k < lenAns; k++){
                            listAns.add(listAns.get(k) + list.get(j));
                        }
                    }
                }

//
//                System.out.println("Temporary List");
//                for(int j = 0; j < list.size(); j++){
//                    System.out.print(list.get(j));
//                }
//                System.out.println();

                list.clear();



            }

            for(int j =0; j < listAns.size(); j++){
                if(listAns.get(j).length() == fNum.length()){
                    System.out.print(listAns.get(j) + " ");
                }
            }





        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
