package Sprint3_1;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H {

    public static class Border implements Comparable<Border> {
        int start;
        int end;

        public Border(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public int compareTo(Border b) {
            if(this.start < b.start){
                return -1;
            } else if(this.start == b.start){
                if(this.end < b.end){
                    return -1;
                } else if(this.end == b.end){
                    return 0;
                } else{
                    return 1;
                }
            } else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        ArrayList<Border> list = new ArrayList<>();
        for (int i = 0; i < temp; i++) {
            list.add(new Border(in.nextInt(), in.nextInt()));
        }
        Collections.sort(list);
//        for(Border s : list){
//            System.out.println(s.start + " " + s.end);
//        }

//        System.out.println("///");
        int index = 0;
        int start = list.get(0).start;
        ArrayList<Border> ans = new ArrayList<>();

        ans.add(new Border(list.get(0).start, list.get(0).end));
        for(int i =1; i < list.size(); i++){
            Border curr = list.get(i);

            if(ans.get(index).end >= curr.start){
                if(curr.start != curr.end)
                    if(curr.end >= ans.get(index).end)
                ans.set(index,new Border(start,curr.end));
            }else{
                ans.add(new Border(curr.start, curr.end));
                index++;
                start = curr.start;
            }
//            System.out.println("START");
//            for(Border s : ans){
//                System.out.println(s.start + " " + s.end);
//            }
//            System.out.println("END");



        }
        for(Border s : ans){
            System.out.println(s.start + " " + s.end);
        }
     }
}
