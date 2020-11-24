package Sprint4_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C {

    public static ArrayList<Person> kondrs = new ArrayList<>();

    static class heapSort {


        public ArrayList<Person> heapStack = new ArrayList<>();


        public void add(Person val) {

            if(!Person.kondrCheck(val.name)) {
                this.heapStack.add(val);
//        for (Person i : this.heapStack) {
//            System.out.print(i.toString() + " ");
//        }
//        System.out.println();

                int indexOfVal = this.heapStack.size() - 1;

//                System.out.println(val + " was aded");
//                System.out.println("Parent of val = " + this.heapStack.get((indexOfVal - 1) / 2));
                if (heapStack.size() > 1) {
                    while (val.compareTo(this.heapStack.get((indexOfVal - 1) / 2)) < 0) {
                        if (indexOfVal == 0) break;

//                        System.out.println("need change");
//                        System.out.println("Comparator val = " + val.compareTo(this.heapStack.get((indexOfVal - 1) / 2)));

                        int parentIndex = (indexOfVal - 1) / 2;
                        int childIndex = indexOfVal;
                        Person temp = this.heapStack.get(parentIndex);

                        this.heapStack.set(parentIndex, val);
                        this.heapStack.set(childIndex, temp);

//                for (T i : this.heapStack) {
//                    System.out.print(i.toString() + " ");
//                }
//                System.out.println();

                        indexOfVal = parentIndex;
                    }


                }
            } else{
                kondrs.add(val);
            }
        }

        public Person getFirstPriority() {
            Person t = this.heapStack.get(0);

            this.heapStack.set(0, this.heapStack.get(this.heapStack.size() - 1));
            this.heapStack.remove(this.heapStack.size() - 1);
//            System.out.println("Tree after get ThePriority");
//            for (Person i : this.heapStack) {
//                System.out.print(i.toString() + " ");
//            }
//            System.out.println();
            heapify(0);


            return t;
        }

        private void heapify(int index) {
            int childFIndex = 2 * index + 1;
            int childSIndex = 2 * index + 2;
            int indexOfChange = 0;

            if (childFIndex < this.heapStack.size() && childSIndex < this.heapStack.size()) {
                if (this.heapStack.get(index).compareTo(this.heapStack.get(childFIndex)) > 0 || this.heapStack.get(index).compareTo(this.heapStack.get(childSIndex)) > 0) {

//                  indexOfChange = this.heapStack.indexOf(Math.min(this.heapStack.get(childFIndex),this.heapStack.get(childSIndex)));

                    if (this.heapStack.get(childFIndex).compareTo(this.heapStack.get(childSIndex)) < 0) {
                        indexOfChange = this.heapStack.indexOf(this.heapStack.get(childFIndex));
                    } else {
                        indexOfChange = this.heapStack.indexOf(this.heapStack.get(childSIndex));
                    }

                    Person temp = this.heapStack.get(index);
                    this.heapStack.set(index, this.heapStack.get(indexOfChange));
                    this.heapStack.set(indexOfChange, temp);

                    heapify(indexOfChange);
                }
            } else if (this.heapStack.size() == 2) {

                if (this.heapStack.get(index).compareTo(this.heapStack.get(index + 1)) > 0) {
                    Person temp = this.heapStack.get(index);
                    this.heapStack.set(index, this.heapStack.get(index + 1));
                    this.heapStack.set(index + 1, temp);
                }

            }

//            System.out.println("heapifying");
//
//            for (Person i : this.heapStack) {
//                System.out.print(i.toString() + " ");
//            }
//            System.out.println();
        }
    }

    static class Person implements Comparable<Person>{

        String name;
        String[] points;
        int sumPoints;

        public Person(String name, String[] points ) {

            this.name = name;
            this.points = points;
            for(String i : points){
                if(Integer.parseInt(i) > 0)
                this.sumPoints+=Integer.parseInt(i);
            }
        }

        public Person(String[] s) {

            this(s[0], s[1].split(" "));

        }

        public static boolean kondrCheck(String name){
            int[] check = new int[9];
            for(int i= 0; i < name.length(); i++){
                switch (name.charAt(i)){
                    case 'k':
                        check[0]++;
                        break;
                    case 'o':
                        check[1]++;
                        break;
                    case 'n':
                        check[2]++;
                        break;
                    case 'd':
                        check[3]++;
                        break;
                    case 'r':
                        check[4]++;
                        break;
                    case 'a':
                        check[5]++;
                        break;
                    case 't':
                        check[6]++;
                        break;
                    case 'i':
                        check[7]++;
                        break;
                    case 'y':
                        check[8]++;
                        break;
                }
            }
            for(int i : check){
                if(i == 0){
                    return false;
                }
            }
            return true;
        }

        @Override
        public int compareTo(Person o) {

            if(this.sumPoints > o.sumPoints){
                return -1;
            } else if(this.sumPoints < o.sumPoints){
                return 1;
            } else{
                if(this.name.compareTo(o.name) > 0){
                    return 1;
                } else if(this.name.compareTo(o.name) < 0){
                    return -1;
                }
                else return -1;
            }
        }

        @Override
        public String toString() {
            return this.name + " " + Arrays.toString(this.points);
        }
    }

    public static void main(String[] args) throws IOException {
        heapSort sort = new heapSort();

        ArrayList<String> ans = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());
        for(int i = 0; i < temp; i++){
            String s = bf.readLine();
            if(s != null){
                sort.add(new Person(s.split(" ", 2)));
            } else{

            }


        }

        while(sort.heapStack.size() > 0) {
            ans.add(sort.getFirstPriority().toString());
        }
        Collections.reverse(kondrs);
        for(Person p : kondrs){
            System.out.println(p.toString());
        }
        for(String s : ans){
            System.out.println(s);
        }


    }
}
