import java.util.Scanner;

public class insertAsterisksBeforeA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a') 
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
//input : banana
//output : b*an*an*a
