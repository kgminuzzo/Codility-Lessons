package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class BinaryGap {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);

        Pattern pattern = Pattern.compile("[0]+");
        String[] gaps = binary.split("1");
        if (gaps.length > 0 && !binary.endsWith("1"))
            gaps = Arrays.copyOf(gaps, gaps.length - 1);
        int maxGap = 0;
        try{
            maxGap = Arrays.stream(gaps)
                    .filter(pattern.asPredicate())
                    .collect(Collectors.toList())
                    .stream()
                    .max(Comparator.comparingInt(String::length))
                    .get().length();
        } finally {
            return maxGap;
        }
    }
}


