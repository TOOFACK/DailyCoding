package Sprint4_review;

import java.util.*;

public class heapSort<T extends Comparable>     {



    public ArrayList<T> heapStack = new ArrayList<>();


    public void add(T val) {
        this.heapStack.add(val);


        int indexOfVal = this.heapStack.size()-1;


            while (val.compareTo(this.heapStack.get((indexOfVal -1)/ 2)) <0) {


                int parentIndex = (indexOfVal-1) / 2;
                int childIndex = indexOfVal;
                T temp = this.heapStack.get(parentIndex);

                this.heapStack.set(parentIndex, val);
                this.heapStack.set(childIndex, temp);



                indexOfVal = parentIndex;
            }



    }

    public T getFirstPriority(){
        T t = this.heapStack.get(0);

        this.heapStack.set(0,this.heapStack.get(this.heapStack.size()- 1));
        this.heapStack.remove(this.heapStack.size() -1);

        heapify(0);
        return t;
    }

    private void heapify(int index) {
        int childFIndex = 2 *index + 1;
        int childSIndex = 2 * index + 2;
        int indexOfChange = 0;

        if(childFIndex < this.heapStack.size() && childSIndex < this.heapStack.size()) {
            if (this.heapStack.get(index).compareTo( this.heapStack.get(childFIndex)) > 0  || this.heapStack.get(index).compareTo(this.heapStack.get(childSIndex)) > 0) {



                  if(this.heapStack.get(childFIndex).compareTo(this.heapStack.get(childSIndex)) < 0){
                      indexOfChange = this.heapStack.indexOf(this.heapStack.get(childFIndex));
                  }
                  else{
                      indexOfChange = this.heapStack.indexOf(this.heapStack.get(childSIndex));
                  }

                T temp = this.heapStack.get(index);
                this.heapStack.set(index, this.heapStack.get(indexOfChange));
                this.heapStack.set(indexOfChange, temp);

                heapify(indexOfChange);
            }
        } else if(this.heapStack.size() == 2){

            if(this.heapStack.get(index).compareTo(this.heapStack.get(index+1)) > 0){
                T temp = this.heapStack.get(index);
                this.heapStack.set(index, this.heapStack.get(index+1));
                this.heapStack.set(index+1, temp);
            }

        }


    }


    public static void main(String[] args) {

         heapSort<Integer> sol = new heapSort<>();


         sol.add(1);
        sol.add(-1);
        sol.add(-4);
        sol.add(0);
        sol.add(5);
        sol.add(62);

        while(sol.heapStack.size() > 0 ) {
            System.out.print(sol.getFirstPriority() + " ");

        }








    }




}
