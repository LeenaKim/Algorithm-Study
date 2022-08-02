package backjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Line2022_2 {

	public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] temps = input.split(" ");
        int[] correctTemps = new int[temps.length];
        
        for(int i = 0; i < temps.length; i++) {
        	if(Integer.parseInt(temps[i]) > 200 || Integer.parseInt(temps[i]) < -200) {
        		correctTemps[i] = -1;
        		continue;
        	}
        	if(temps.length == 2) {
        		if(Math.abs(Integer.parseInt(temps[0]) - Integer.parseInt(temps[1])) >= 3) {
        			correctTemps[i] = -1;
        			correctTemps[i+1] = -1;
        			break;
        		}
        	}
        	if(temps.length == 3) {
        		if(Math.abs(Integer.parseInt(temps[i]) - Integer.parseInt(temps[i+1])) >= 3 && Math.abs(Integer.parseInt(temps[i+1]) - Integer.parseInt(temps[i+2])) >= 3) {
        			correctTemps[i+1] = -1;
        			break;
        		}
        	}
        	int cnt = 0;
        	int jcnt = 0;
        	for(int j = i-2; j <= i+2; j++) {
        		if(j >= 0 && j <= temps.length-1) {
        			++jcnt;
        			if(Math.abs(Integer.parseInt(temps[i]) - Integer.parseInt(temps[j])) >= 3) {
            			++cnt;
            		}
        		}
        	}
        	if(cnt == jcnt) {
        		correctTemps[i] = -1;        		
        	}
        }
        
        String answer = "ERROR";
        int correctCnt = 0;
        int sum = 0;
        for(int i = 0; i < correctTemps.length; i++) {
        	if(correctTemps[i] == 0) {
        		++correctCnt;
        		sum += Integer.parseInt(temps[i]);
        	}
        }
        if(sum != 0) {
        	answer = Integer.toString(sum / correctCnt);
        }
        System.out.println(answer);
    }

}
