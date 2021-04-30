package com.company;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> values = new HashSet<Integer>();
        int target = X;
        for (int i = 0; i < A.length; i++) {
            if(A[i]<=target)
                if (values.add(A[i]))
                    X--;
            if (X == 0)
                return i;
        }
        return -1;
    }
}
