package YandexIntership;



import java.util.ArrayList;


import java.util.Scanner;

public class A {


    static class Pad   {
        @Override
        public String toString() {
            return this.getStart() + " " + this.getEnd();
        }

        static int g = 0;
       private int start;
       private int end;
       private int index;
       private int amountPads;

        public Pad(int start, int amountPads) {
            this.start = start;
            this.amountPads = amountPads;
            this.index = g;
            g++;
            this.end = start - 1 + amountPads;
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

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getAmountPads() {
            return amountPads;
        }

        public void setAmountPads(int amountPads) {
            this.amountPads = amountPads;
        }



    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        ArrayList<Pad> list = new ArrayList<>();
        for (int i =0; i < temp; i++){
        int start = in.nextInt();
        int amountPads = in.nextInt();
        Pad pad = new Pad(start, amountPads);
        list.add(pad);
        }

        for(Pad p : list){
            System.out.print(p.getStart() + " " + p.getEnd() +  " " + p.getIndex());
            System.out.println();
        }

        list.sort((o1, o2) -> {
            if(o1.getStart() < o2.getStart()){
                return -1;
            } else if(o1.getStart() > o2.getStart()){
                return 1;
            } else if(o1.getStart() == o2.getStart()){
                return Integer.compare(o1.getEnd(), o2.getEnd());
            }
            return 0;
        });

        for(Pad p : list){
            System.out.print(p.getStart() + " " + p.getEnd());
            System.out.println();
        }

        ArrayList<ArrayList<Pad>> un = new ArrayList<>();

        int index = 0;

        ArrayList<Pad> un2 = new ArrayList<>();

        while(list.size() != 0){
            for(Pad p : list){
                if(un2.size() == 0){
                    un2.add(p);

                } else if(un2.get(un2.size()-1).getEnd() < p.getStart()){
                    un2.add(p);

                }

            }
            ArrayList<Pad> b= new ArrayList<Pad>(un2);
            un.add(index, b);
            list.removeAll(un2);
            un2.clear();

            index++;
        }
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(ArrayList<Pad> p : un){
            System.out.println(p.toString());
        }


        for(ArrayList<Pad> d : un){
            int currMax = 0;
            ArrayList<Integer> ans2 = new ArrayList<>();
            for(Pad p : d){
                currMax += p.amountPads;
                ans2.add(p.index);
            }

            if(max < currMax){
                max = currMax;
                ans.clear();
                ans.addAll(ans2);
                ans2.clear();
            }
        }
        System.out.println(max);
        for(int t : ans){
            System.out.print(t + " ");
        }


    }
}
