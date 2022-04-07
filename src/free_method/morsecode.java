package free_method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class morsecode {

	public static String morse(String code)
	{
		Map<String, String> table = new HashMap<String, String>();
		table.put("ㆍᆢ","A");
		table.put("ᆢㆍㆍㆍ", "B");
		table.put("ᆢㆍᆢㆍ","C");
		table.put("ᆢㆍㆍ", "D");
		table.put("ㆍ", "E");
		table.put("ㆍㆍᆢㆍ", "F");
		table.put("ᆢᆢㆍ", "G");
		table.put("ㆍㆍㆍㆍ", "H");
		table.put("ㆍㆍ", "I");
		table.put("ㆍᆢᆢᆢ", "J");
		table.put("ᆢㆍᆢ", "K");
		table.put("ㆍᆢㆍㆍ", "L");
		table.put("ᆢᆢ", "M");
		table.put("ᆢㆍ", "N");
		table.put("ᆢᆢᆢ", "O");
		table.put("ㆍᆢᆢㆍ", "P");
		table.put("ᆢᆢㆍᆢ", "Q");
		table.put("ㆍᆢㆍ", "R");
		table.put("ㆍㆍㆍ", "S");
		table.put("ᆢ", "T");
		table.put("ㆍㆍᆢ", "U");
		table.put("ㆍㆍㆍᆢ", "V");
		table.put("ㆍᆢᆢ", "W");
		table.put("ᆢㆍㆍᆢ", "X");
		table.put("ᆢㆍᆢᆢ", "Y");
		table.put("ᆢᆢㆍㆍ", "Z");
		
		return table.get(code);
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		
		while(st.hasMoreTokens())
		{
				bw.write(morse(st.nextToken())));
		}
		bw.flush();
		br.close();
	}
}
