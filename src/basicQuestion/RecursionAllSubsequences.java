package basicQuestion;

import java.util.*;
public class RecursionAllSubsequences {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			String str = sc.next();
			ArrayList<String> result = getSS(str);
			Collections.sort(result);  
			for(String ss:result)    
		    	System.out.println(ss);    
  
		}
	}
	public static ArrayList<String> getSS(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		for(int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;	
    }
}