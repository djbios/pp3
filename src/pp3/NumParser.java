package pp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumParser {

	 public String[] numbers;
	
	public  void ReadFile() throws FileNotFoundException
	{
		ArrayList<String> inp = new ArrayList<String>();
		Scanner in = new Scanner(new File("numbers.txt"));
		while (in.hasNextLine())
			inp.add(in.nextLine());
		numbers = inp.toArray(new String[0]);
		System.out.println("");
	}
	
	public String ParseString(String str)
	{
		for(Integer i =numbers.length-1;i>=0;i--)
		{
			str = str.replaceAll(numbers[i], i.toString());
		}
		return str;
		
	}
}
