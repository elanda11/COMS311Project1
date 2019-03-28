import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class JunitTests {

	@Test
	void nodeColor() {
		Node node = new Node();
		assertEquals(node.color, 0);
	}
	
	@Test
	void nodeSetColor() {
		Node node = new Node();
		node.color = 1;
		assertEquals(node.color, 1);
	}

}
