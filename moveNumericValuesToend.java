import java.util.Scanner;

public class moveNumericValuesToend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t1="";
		String t2="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') 
			{
				t1 =t1+ch;
			}
			else
			{
				t2 =t2+ch;
			}
		}
		System.out.println(t2+t1);

	}

}
