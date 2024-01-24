import java.util.Scanner;

public class spaceCountInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==' ') 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
