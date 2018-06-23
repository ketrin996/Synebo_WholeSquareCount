package com.company;
import java.util.*;


public class Solution {
    private ArrayList<Integer> Array;
    private ListIterator<Integer> iter;
    private int N;
    public int start_interval;
    public int end_interval;


    public Solution() {

    }
    public int solution(int A, int B) {

        start_interval = A;
        end_interval = B;
        int count = 0;

        if (A >= 0) {
            N = B - A + 1;
        } else {
            N = Math.abs(A) + B + 1;
        }
        if (A > B) {
            System.out.println("Error, A > B!!!");
        } else {

            Array = new ArrayList<>(N);
            //Инициализация массива
            for (int i = 0; i < N; i++) {
                Array.add((int) (start_interval + i));
            }


            iter = Array.listIterator();
            int value;
            int tmp = 0;

            while (iter.hasNext()) {
                //подсчитываем кол-во полных квадратов

                value = iter.next();
                if (Math.sqrt(value) % 1 == 0 && value > 0) {
                    count ++ ;
                    System.out.println("Whole square=" + " " + value);

                }
            }
        }
            return count;
        }


    public void show_array()
    {
        System.out.println("Interval from A = " + start_interval + " " + "to" + " " + "B = " + end_interval);
        for (int i = 0; i< Array.size(); i++)
        {
            System.out.print(start_interval + i +" ");
        }
        System.out.println();
    }
}






