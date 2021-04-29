package com.company;


public class TapeEquilibrium {
    public int solution(int[] A) {
        long sumRight = 0, sumLeft = 0;
        for (int i : A) sumRight += i;
        long smallestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            sumLeft += A[i];
            sumRight -= A[i];
            int diff = Math.abs((int) (sumRight - sumLeft));
            if (diff < smallestDiff)
                smallestDiff = diff;
        }

        return (int) smallestDiff;
    }
}
