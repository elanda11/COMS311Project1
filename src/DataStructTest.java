
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataStructTest {

	// Instance Variables
	RBTree tree;
	Node node1;
	Node node2;
	Node node3;
	Node node4;
	Node node5;
	Node node6;
	Node node7;
	Node node8;

	@Before public void initialize() {
		tree = new RBTree();
		node1 = new Node();
		node2 = new Node();
		node3 = new Node();
		node4 = new Node();
		node5 = new Node();
		node6 = new Node();

		node1.parent = node2;
		node1.left = tree.NIL;
		node1.right = tree.NIL;
		node1.key = 0;
		node1.color = 1;
		node1.val = 1;
		node1.p = 1;
		node1.maxval =

		tree.root = node4;
	}

	@Test public void Insert() {
		tree.RBInsert(node6);
		assertEquals(tree.getRoot().getKey(), 4);
		assertEquals(tree.getRoot().getColor(), 1);
	}


}
