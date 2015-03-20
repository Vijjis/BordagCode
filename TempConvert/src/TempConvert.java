import java.io.*;
public class TempConvert 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		double nCelsius = 25.5;
		double nFaren = convertToFar(nCelsius);
		System.out.println(nCelsius + "Celsius converts to " + nFaren + "degrees Farenheit");
		double nResult = convertToCel(nFaren);
		System.out.println(nFaren + "Farenheit converts to " + nResult + "degrees Celsius");
	}
	
	public static double convertToFar(double nCel)
	{
		double nFar = 0;
		nFar = (nCel * 9)/5 + 32;
		return nFar;
	}
	
	public static double convertToCel(double nFar)
	{
		double nCel = 0;
		nCel = (nFar - 32) * 5/9;
		return nCel;
	}
}
 