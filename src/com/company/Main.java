package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // BINARY GAP (100%)
        //System.out.println(new BinaryGap().solution(304));

        //CYCLIC ROTATION (100%)
        //System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{}, 1)));

        //ODD NUMBERS (100%)
        //System.out.print(new OddNumbers().solution(new int[]{9,3,9,3,9,7,9}));

        //FROG JUMPS (100%)
        //System.out.print(new FrogJumps().solution(30,40,0));

        //PERM MISSING ELEMENT (100%)
        //System.out.println(new PermMissingElem().solution(new int[]{5,1,2,3}));

        //TAPE EQUILIBRIUM (100%)
        //System.out.println(new TapeEquilibrium().solution(new int[]{2000,100}));

        //FROG RIVER (100%)
        //System.out.println(new FrogRiverOne().solution(1, new int[] {1}));

        //COUNT DIV (100%)
        //System.out.println(new CountDiv().solution(10,30,7));

        //PERMUTATION CHECK (100%)
        //System.out.println(new PermCheck().solution(new int[] {4, 2, 2, 2}));

        //MAX COUNTERS (100%) https://app.codility.com/demo/results/trainingX7ARMA-WQ9/
        //System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3,4,4,6,1,4,4})));


        //MISSING INTEGER (100%) https://app.codility.com/demo/results/trainingGY9VVF-VDD/
        //System.out.println(new MissingInteger().solution(new int[] {-1,2}));

        //GENOMIC RANGE QUERY
        System.out.println(new GenomicRangeQuery().solution("CAGCCTA",new int[]{2,5,0}, new int[]{4,5,6}));
    }

}
