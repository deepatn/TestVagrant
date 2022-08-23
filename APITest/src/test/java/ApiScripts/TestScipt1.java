package ApiScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import generic.JsonExtract;

public class TestScipt1 
{
	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException
	{
		try {
				int count = 0;
				JSONArray a1 = JsonExtract.fetch_json();
				for(int i=0; i<a1.size(); i++)
				{
					Object List = a1.get(i);
						if(!(List.toString().contains("India")))
						{
							count++;
						}
				}
				if(count == 4)
				{
					System.out.println("Testcase is Pass");
				}
				else 
				{
					System.out.println("Testcase is Fail");
				}
			}
		catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
}

