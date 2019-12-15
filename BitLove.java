public class BitLove
{
	public static void main(String[] args)
	{
		System.out.println("bit love baby");
		int x=0b101;
		int y=0b110;
		int z=x+y;

		System.out.println(x + "+" + y + "=" + z);
		//5+6=11

		/*
		* If you want to output in binary format, use Integer.toBinaryString()
		*/

		System.out.println(Integer.toBinaryString(x) + 
			"+" + Integer.toBinaryString(y)+ 
			"=" + Integer.toBinaryString(z));

		int a = -2;
		System.out.println("a: " + Integer.toBinaryString(a));
		int b = a << 3;
		System.out.println("b: shift a 3: " + Integer.toBinaryString(b));
		System.out.println("b dec form: " + b);
		int c = a >>> 1;
		System.out.println("c: " + Integer.toBinaryString(c) + " c dec: " + c);
		int d = 65;
		System.out.println("d: " + String.valueOf(Integer.toBinaryString(d >>> 1)));

		int e = Integer.MAX_VALUE;
		System.out.println("max: " + e + " bin: " + Integer.toBinaryString(e));
		int f = e << 2;
		System.out.println("f dec: " + f + " f: bin: " + Integer.toBinaryString(f));
	}	
}