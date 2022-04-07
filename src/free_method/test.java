package free_method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;



public class test {

	public static long sum(int[] a)
	{
		long result = 0 ;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			result += a[i];
		}
		
		return result;
	}
	
	public static void print(int[] a)
	{
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
		
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0;
		n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(String.valueOf(sum(a)));
		
		
		br.close();
		bw.flush();
	}
}
