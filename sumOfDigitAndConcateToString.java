import java.util.Scanner;

public class sumOfDigitAndConcateToString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t="";
		int sum =0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch>='0' && ch<='9')) 
			{
				sum =sum+(int)ch -48;
			}
			else
			{
				t =t+ch;
			}
		}
		System.out.println(t+sum);

	}

}
