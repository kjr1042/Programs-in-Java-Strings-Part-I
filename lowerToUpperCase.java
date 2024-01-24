import java.util.Scanner;

public class lowerToUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t ="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='a'&& ch<='z')  // for upperCase (ch>='A'&& ch<='Z')
			{
				t = t+(char)((int)ch-32);   // t = t+(char)((int)ch+32);
				
				
			}
			else 
			{
				t =t+ch;
			}
		}
		System.out.println(t);

	}

}