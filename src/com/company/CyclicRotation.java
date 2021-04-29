package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        int[] result = A;
        try {
            if(K>A.length)
                K = K % A.length;
            if (K > 0 && K < A.length) {
                int[] first = Arrays.copyOfRange(A, A.length-K, A.length );
                int[] second = Arrays.copyOfRange(A, 0 , A.length-K);
                result = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
            }
        }catch(Exception e){

        }
        return result;
    }
}
