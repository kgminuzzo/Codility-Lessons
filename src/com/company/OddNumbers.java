package com.company;

public class OddNumbers {
    public int solution(int[] A) {
        int a = 0;
        for (int i = 0; i < A.length; i++ ){
            a = a ^ A[i];
        }

       return a;
    }
}
