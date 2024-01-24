import java.util.Scanner;

public class consonantsCountInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count =0;
		int vcount =0;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'))
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
				{
					vcount++;
				}
				count++;
			}
		}
		System.out.println(count-vcount);

	}

}
