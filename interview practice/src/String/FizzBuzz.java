package String;

public class FizzBuzz {
	public String[] solution(int n) {
		String[] str=new String[n];		
		for(int i=1;i<=n;i++) {
		if(i%3==0 && i%5==0)
		{
			str[i]="fizzbuzz";
		}else if(i%3==0) {
				str[i]="fizz";
			}else if(i%5==0) {
				str[i]="buzz";
			}else {
				str[i]=i+"";
			}
		}
		
		return str;
	}
}
