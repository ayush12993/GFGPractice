package com.gfg.stack.thecellebrityprblem;

public class GFG {
    static final int N=8;
    static int[][] MATRIX = { { 0, 0, 1, 0 },
            { 0, 0, 1, 1 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };


    static int findCelebrity(int n){
        int[] inDegree = new int[n];
        int[] outDegree = new int[n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int x = MATRIX[i][j];
                outDegree[i] +=x;
                inDegree[j] +=x;
            }
        }
        for (int i=0;i<n;i++)
            if (inDegree[i]==n-1 && outDegree[i]==0)
                return i;
        return -1;
    }

    public static void main(String[] args)
    {
        int n = 4;
        int id = findCelebrity(n);
        if (id == -1)
            System.out.print("No celebrity");
        else
            System.out.print("Celebrity ID " + id);
    }
}
