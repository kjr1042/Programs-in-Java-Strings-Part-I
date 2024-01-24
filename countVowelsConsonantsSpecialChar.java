import java.util.Scanner;

public class countVowelsConsonantsSpecialChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int consonantCount =0;
		int vcount =0;
		int specialcount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'))
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
				{
					vcount++;
				}
				consonantCount++;
			}
			if(!((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')))
			{
				specialcount++;
			}
			
		}
		int c=consonantCount-vcount;
		System.out.println("Consonants: "+c);
		System.out.println("vowels: "+vcount);
		System.out.println("special Character: "+specialcount);


	}

}
