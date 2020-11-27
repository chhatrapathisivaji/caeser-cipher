package caeser.cypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaeserCypherTest {

	private CaeserCypher caesercypher = new CaeserCypher();
	@Test
	void testCypheredMessageOffset12() {
		assertEquals("tai mdq kag pauzs fapmk", caesercypher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesercypher.cipher("", 12));
	}

}
