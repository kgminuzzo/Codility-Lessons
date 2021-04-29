package com.company;

public class PermMissingElem {
    public int solution(int[] A) {
        long lastNumber = A.length+1;
        long sum = lastNumber * (lastNumber+1)/2;
        int arraySum = 0;
        for (int value : A) arraySum += value;

        return Long.valueOf(sum - arraySum).intValue();
    }
}
