package String;

public class Backspace {
	public boolean backSpaceCompare(String s,String t) {
		int count=0,count1=0;
		String s1="",t1="";
		for(int i=s.length()-1;i>=0;i--) {
			if(!(s.charAt(i)=='#')) {
				if(count==0) {
				s1=s1+s.charAt(i);
				}else {
					 
					i=i-count+1;
					count=0;
				}
			}else {
				count++;
				}
			}
		
		for(int i=t.length()-1;i>=0;i--) {
			if(!(t.charAt(i)=='#')) {
				if(count1==0) {
				t1=t1+t.charAt(i);
				}else {
					i=i-count1+1;
					count1=0;
				}
			}else {
				count1++;
				}
		}
		
		return s1.equals(t1);		
	}
}
