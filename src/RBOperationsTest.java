
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RBOperationsTest {

	// Instance variables
	RBTree testtree;
	RBTree scratchtree;
	Node tnode1;
	Node tnode2;
	Node tnode3;
	Node tinsert;

	Node insert1;
	Node insert2;
	Node insert3;
	Node insert4;


	@Before public void initialize() {
		testtree = new RBTree();
		tnode1 = new Node();
		tnode2 = new Node();
		tnode3 = new Node();
		tinsert = new Node();

		scratchtree = new RBTree();
		insert1 = new Node();
		insert2 = new Node();
		insert3 = new Node();
		insert4 = new Node();

		insert1.key = 1;
		insert1.color = 0;
		insert2.key = 2;
		insert2.color = 0;
		insert3.key = 3;
		insert3.color = 0;
		insert4.key = 4;
		insert4.color = 0;

		tnode1.parent = testtree.NIL;
		tnode1.left = tnode2;
		tnode1.right = tnode3;
		tnode1.key = 2;
		tnode1.color = 1;

		tnode2.parent = tnode1;
		tnode2.left = testtree.NIL;
		tnode2.right = testtree.NIL;
		tnode2.key = 1;
		tnode2.color = 0;

		tnode3.parent = tnode1;
		tnode3.left = testtree.NIL;
		tnode3.right = testtree.NIL;
		tnode3.key = 4;
		tnode3.color = 0;

		tinsert.key = 3;
		tinsert.color = 0;

		testtree.root = tnode1;
	}

	@Test public void testOne() {
		testtree.RBInsert(tinsert);
		assertEquals(testtree.getNILNode(), testtree.NIL);
		assertEquals(testtree.getRoot().getKey(), 2);
		assertEquals(tinsert.getParent(), tnode3);
		assertEquals(tinsert.getLeft(), testtree.NIL);
		assertEquals(tinsert.getRight(), testtree.NIL);
		assertEquals(tnode3.getLeft(), tinsert);
		assertEquals(tinsert.getColor(), 0);
	}

	@Test public void testTwoInsert1() {
		scratchtree.RBInsert(insert1);
		assertEquals(scratchtree.getRoot(), insert1);
		assertEquals(scratchtree.getRoot().getColor(), 1);
		scratchtree.RBInsert(insert2);
		assertEquals(scratchtree.getRoot().getRight(), insert2);
		assertEquals(scratchtree.getRoot().getLeft(), scratchtree.NIL);
		scratchtree.RBInsert(insert3);
		assertEquals(scratchtree.getRoot(), insert2);
		assertEquals(scratchtree.getRoot().getLeft(), insert1);
		assertEquals(scratchtree.getRoot().getRight(), insert3);
		assertEquals(scratchtree.getRoot().getColor(), 1);
	}

}
