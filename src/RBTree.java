/**
 * Team members:
 * @author Lauren Arner
 * @author Richard Smith
 * @author Justin Sung
 *
 * RBTree class, maintains operations on RBTree.
 */
public class RBTree {

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */
	Node root;
	Node NIL;
	int nodeCount;
	int treeHeight;

	public RBTree() {
		//TODO: Add code as needed.

		this.NIL = new Node();
		this.NIL.color = 1;
		this.root = this.NIL;
		NIL.parent = NIL;
		NIL.left = NIL;
		NIL.right = NIL;

	}

	/**
	 * Returns the root of teh tree.
	 * @return
	 */
	public Node getRoot() {

		return this.root;
	}

	/**
	 * Returns reference for the nil node, for the rbTree.
	 * @return
	 */
	public Node getNILNode() {
		return this.NIL;
	}

	/**
	 * Returns the number of internal nodes in the tree.
	 * @return
	 */
	public int getSize() {
		return this.nodeCount;
	}


	/**
	 * Returns the height of the tree.
	 * @return
	 */
	public int getHeight() {
		return this.treeHeight;
	}

	//Add more functions as  you see fit.

	/**
	 * Computes value variable for nodes recursively
	 * @param node
	 * @return
	 */
	public int computeVal(Node node) {

		if(node == NIL) {
			return 0;
		}

		return computeVal(node.left) + node.p + computeVal(node.right);

	}

	/**
	 * Computes max value variable for nodes
	 * @param node
	 */

	public void computeMaxVal(Node node) {

		node.maxval = max(node.left.getMaxVal(), node.right.getMaxVal() + node.getP(), node.left.getVal() + node.getP() + node.right.getMaxVal());

		if (node.maxval == node.left.getMaxVal()){
			node.emax = node.left.getEmax();
		}
		else if (node.maxval == node.right.getMaxVal() + node.getP()) {
			node.emax = node.getEndpoint();
		}
		else {
			node.emax = node.right.getEmax();
		}
	}

	/**
	 * private three variable int comparator
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	private int max(int first, int second, int third) {
		int max;

		if(first >= second && first >= third) {
			max = first;
		}else if(second >= first && second >= third) {
			max = second;
		}else {
			max = third;
		}
		return max;
	}


}
