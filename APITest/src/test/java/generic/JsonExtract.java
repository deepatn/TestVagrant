package generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExtract 
{
	public static JSONArray fetch_json() throws ParseException, FileNotFoundException, IOException
	{
		JSONParser jp = new JSONParser();
		Object a1 = jp.parse(new FileReader("./src/test/java/utils/TeamRCB.json"));
		JSONObject j1 = (JSONObject) a1;
		JSONArray j2 = (JSONArray) j1.get("player");
		return j2;
	}
}
