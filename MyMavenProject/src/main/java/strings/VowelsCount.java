package strings;

public class VowelsCount {

	
	public static boolean isVowels(char t)
	{
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
				t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
				
	}
	public static void main(String[] args) {
		String str = "apple";
		int vCount = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(isVowels(str.charAt(i)))
			{
				vCount++;
			}
		}
		System.out.println(vCount);
	}

}
