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
	int height;
	
	public RBTree() {
		//TODO: Add code as needed.
		
		this.NIL = new Node();
		this.NIL.color = 1;
		this.root = this.NIL;
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
		return this.height;
	}
	
	//Add more functions as  you see fit.
}
