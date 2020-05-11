package com.kaustubh;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TownJudge {

	public static void main(String[] args) {
		int[][] trust = {{1,2}};
		int[][] trust2 = {{1,3},{2,3},{3,1}};
		int[][] trust3 = {{1,2},{2,3}};
		int[][] trust4= {{1,3},{1,4},{2,3},{2,4},{4,3}};
		int[][] trust5= {};
		int N=1;
		TownJudge obj = new TownJudge();
		System.out.println(obj.findJudge(N, trust5));

	}
	
    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1) return i;
        }
        return -1;
        
    }

}
