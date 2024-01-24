import java.util.Scanner;

public class specialCharactersCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(!((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z') || (ch>='0' && ch<='9') || ch==' '))
			{
				count++;
				System.out.println(ch);
			}
			
		}
		System.out.println(count);

	}

}
