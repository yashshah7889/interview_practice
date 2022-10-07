package String;

public class RemoveDuplicateCh {
	public static void main(String args[]) {
		String str="hellllhlo";
		String new1="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int ind=str.indexOf(c, i+1);
			if(ind==-1)
				new1=new1+c;
		}
		System.out.println(new1);
		
		//approach2
		String new2="";
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean repeated=false;//flag
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				new2=new2+arr[i];
			}
		}
		System.out.println(new2);
}
}