package String;

public class RemoveSomething {
	public static void main(String args[]) {
		String str="h$e#l^l&o";
		
		String plainString=str.replaceAll("[^a-zA-Z0-9]", "  ");
		String TrimmedString=plainString.replaceAll("\\s","");//\\s represnets single space.
		
		System.out.println(TrimmedString);
}
}