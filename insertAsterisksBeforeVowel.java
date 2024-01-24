import java.util.Scanner;

public class insertAsterisksBeforeVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'
					|| ch=='I' || ch=='O' || ch=='U') 
			{
				t =t+"*"+ch;
			}
			else
			{
				t =t+ch;
			}
		}
		System.out.println(t);

	}

}
