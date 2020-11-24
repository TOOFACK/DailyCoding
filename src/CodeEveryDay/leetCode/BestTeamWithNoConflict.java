package CodeEveryDay.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BestTeamWithNoConflict {
    public static class Team implements Comparable<Team>{
         int age;
         int score;

        public Team(int age, int score) {
            this.age = age;
            this.score = score;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public int compareTo(Team o) {
            if(this.age < o.age){
                return -1;
            } else if(this.age > o.age){
                return 1;
            } else {
                if(this.score > o.age){
                    return -1;
                } else if(this.score < o.score){
                    return 1;
                } else return 0;
            }
        }
    }

    public int bestTeamScore(int[] scores, int[] ages) {

        return 0;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] score = new int[in.nextInt()];
            for(int i =0; i < score.length;i++){
                score[i] = in.nextInt();
            }
        int[] age = new int[in.nextInt()];
        for(int i =0; i < age.length;i++){
            age[i] = in.nextInt();
        }

        ArrayList<Team> team = new ArrayList<>();
        for(int i =0; i < score.length; i++){
            team.add(new Team(age[i],score[i]));
        }
        Collections.sort(team);

        for(Team t : team){
            System.out.println(t.age + " " + t.score);
        }
    }

}
