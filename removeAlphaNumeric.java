import java.util.Scanner;

public class removeAlphaNumeric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))) 
			{
				t =t+ch;
			}
		}
		System.out.println(t);

	}

}
