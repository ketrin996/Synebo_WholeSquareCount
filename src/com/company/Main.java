package com.company;


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println("Whole square count = "+ " "+ solution.solution(-10,10));
        solution.show_array();
        System.out.println("Whole square count = "+ " "+ solution.solution(0,100));
        solution.show_array();
        System.out.println("Whole square count = "+ " "+ solution.solution(200,100));
        solution.show_array();
        System.out.println("Whole square count = "+ " "+ solution.solution(-10,0));
        solution.show_array();

    }
}
