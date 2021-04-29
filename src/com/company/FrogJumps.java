package com.company;

public class FrogJumps {
    public int solution(int X, int Y, int D) {
        if(D==0)
            return 0;
        int distance = Y-X;
        return distance%D>0?(distance/D)+1 : distance/D;
    }
}
