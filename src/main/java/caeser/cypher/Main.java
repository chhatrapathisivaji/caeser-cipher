package caeser.cypher;

public class Main {

	public static void main(String[] args) {
		int offset=12;
		String message=" how are you doing today";
		CaeserCypher caesercypher =new CaeserCypher();
		System.out.println(" Old Message : "+message);
		System.out.println(" Offset : "+ offset);
		System.out.println(" Cyphered Message : "+caesercypher.cipher(message, offset) );
	}

}
