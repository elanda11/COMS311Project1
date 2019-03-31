import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTests {

	//INSTANCES
	RBTree tree;
	Node node1;
	Node node2;
	Node node3;
	Node node4;
	Node node5;
	Node node6;

	@Before public void initialize() {
		tree = new RBTree();
		node1 = new Node();
		node2 = new Node();
		node3 = new Node();
		node4 = new Node();
		node5 = new Node();
		node6 = new Node();

		node1.key = 0;
		node1.color = 0;

		node2.key = 1;
		node2.color = 0;

		node3.key = 2;
		node3.color = 0;

		node4.key = 3;
		node4.color = 0;

		node5.key = 4;
		node5.color = 0;

		node6.key = 5;
		node6.color = 0;

	}

	@Test public void updateTest() {
		tree.RBInsert(node1);
		tree.RBInsert(node2);
		tree.RBInsert(node3);
		tree.RBInsert(node6);

		assertEquals(tree.getRoot(), node2);
		assertEquals(tree.getRoot().getLeft(), node1);
		assertEquals(tree.getRoot().getRight(), node3);
		assertEquals(tree.getRoot().getRight().getRight(), node6);

		assertEquals(tree.getRoot().getP(), 1);
		assertEquals(tree.getRoot().getVal(), 0);

		tree.RBInsert(node4);


	}

}
