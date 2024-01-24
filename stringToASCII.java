import java.util.Scanner;

public class stringToASCII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			System.out.print((int)ch +" ");
		}

	}

}
