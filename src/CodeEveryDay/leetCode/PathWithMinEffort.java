package CodeEveryDay.leetCode;

import CodeEveryDay.leetCode.Mock1.A;

import java.util.ArrayList;
import java.util.TreeSet;

public class PathWithMinEffort {
    public static TreeSet<Integer> efforts = new TreeSet<>();
    public int minimumEffortPath(int[][] heights) {



        return 0;
    }

    public static int findUtil(int i, int j, int[][] mas, int effort){
        if(i == mas[0].length-1 && j == mas.length-1){
            efforts.add(effort);
        }

        if(j+1 < mas[0].length){
                effort = Math.abs(mas[i][j]  - mas[i][j+1]);
            System.out.println("Move next col");
            System.out.println("effort now is = " +effort);
            findUtil(i,j+1,mas,effort);
        }
        if(i+1 < mas.length){
                effort = Math.abs(mas[i][j] - mas[i+1][j]);
            findUtil(i+1,j,mas,effort);
        }

        return effort;

    }

    public static void main(String[] args) {
        int[][] mas = {{1,10,6,7,9,10,4,9}};



        findUtil(0,0,mas,100000);
        System.out.println(efforts.first());

    }
}
