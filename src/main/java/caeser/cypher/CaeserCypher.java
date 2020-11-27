package caeser.cypher;

public class CaeserCypher
{
 private static final int  size=26;
 private static final char a='a',z='z';
 
 public String cipher(String message,int offset)
 {
	 offset%=size;
	 char[] character=message.toCharArray();
	 offsetBy(character,offset);
	 return new String(character);
 }

private void offsetBy(char[] character, int offset) 
{
	for(int i =0;i<character.length;++i)
	{
		if(character[i]!=' ')
		character[i]=offsetChar(character[i],offset);
	}
	
}

private char offsetChar(char c, int offset ) 
{
	c+=offset;
	if(c<a)
		return (char)(c+size);
	if(c>z)
		return (char)(c-size);

	return c;
}
}
