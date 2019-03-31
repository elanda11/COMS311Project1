
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataStructTest {

	// Instance Variables
	Intervals inter;
	Node node1;
	Node node2;
	Node node3;
	Node node4;
	Node node5;
	Node node6;
	Node node7;
	Node node8;

	@Before public void initialize() {
		inter = new Intervals();
		node1 = new Node();
		node2 = new Node();
		node3 = new Node();
		node4 = new Node();
		node5 = new Node();
		node6 = new Node();
		node7 = new Node();
		node8 = new Node();


		node1.key = 0;
		node1.color = 0;

		node2.key = 1;
		node2.color = 0;

		node3.key = 3;
		node3.color = 0;

		node4.key = 4;
		node4.color = 0;

		node5.key = 6;
		node5.color = 0;

		node6.key = 7;
		node6.color = 0;

		node7.key = 9;
		node7.color = 0;

		node8.key = 11;
		node8.color = 0;

	}

	@Test public void Insert() {
		inter.intervalInsert(node1.key, node4.key);
		inter.intervalInsert(node2.key, node5.key);
		inter.intervalInsert(node3.key, node7.key);
		inter.intervalInsert(node6.key, node8.key);

		// assertEquals(inter.getRBTree().getRoot(), inter.getRBTree().getRoot());
		// assertEquals(inter.getRBTree().getRoot().getRight(), node6);
		// assertEquals(inter.getRBTree().getRoot().getRight().getRight(), node7);
		// assertEquals(inter.getRBTree().getRoot().getRight().getRight().getRight(), node8);
		// assertEquals(inter.getRBTree().getRoot().getRight().getLeft(), node5);
		//
		// assertEquals(inter.getRBTree().getRoot().getLeft(), node2);
		// assertEquals(inter.getRBTree().getRoot().getLeft().getLeft(), node1);
		// assertEquals(inter.getRBTree().getRoot().getLeft().getRight(), node3);
		//
		// assertEquals(inter.getRBTree().getRoot(), node4);
		// assertEquals(inter.getRBTree().getRoot().getColor(), 1);
		// //assertEquals(tree.getRoot().getP(), -1); THIS WILL COME FROM THE INTERVAL INSERT!!!
		// assertEquals(inter.getRBTree().getRoot().getVal(), 0);


	}


}
