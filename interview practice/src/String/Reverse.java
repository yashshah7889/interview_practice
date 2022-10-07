package String;

public class Reverse {
	public static void main(String args[]) {
		String str="hello";
		//1st method.
		char[] arr=str.toCharArray();
		for(int i=arr.length;i>=0;i--) {
			System.out.println(arr[i]);
		}
		//2nd method
		for(int i=str.length();i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		//3rd method
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		//4rd method
				StringBuilder sb1=new StringBuilder(str);
				sb1.reverse();
	}
}
