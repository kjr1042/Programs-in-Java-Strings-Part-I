import java.util.Scanner;

public class replaceUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z')) 
			{
				t =t+"*";
			}
			else
			{
				t =t+ch;
			}
		}
		System.out.println(t);

	}

}
