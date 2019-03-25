import java.util.Arrays;

/**
 * Team members:
 * @author Lauren Arner
 * @author Richard Smith
 * @author Justin Sung
 * 
 * A wrapper class for RBTree
 */
public class Intervals {
	//private int ID = 0; If deletion is done, this could be used to keep track of edpoints
	//                    for the same interval.
	
	private  int a, b;
	
	/**
	 * Constructor with no parameters.
	 */
	public Intervals() {
		//TODO: Complete it as needed
		this.a = 0; this.b = 0;
	}
	
	/**
	 * 
	 * Adds the interval with left endpoint a and right endpoint b 
	 * to the collection of intervals. Each newly inserted interval 
	 * must be assigned an ID. The IDs should be consecutive; that is, 
	 * the ID of the interval inserted on the ith call of this method should be i.
	 * For example if intervalInsert is called successively to insert intervals 
	 * [5,7],[4,9],[1,8], then the IDs of these intervals should be 1,2,3, respectively.These IDs are permanent
	 *  for the respective intervals. Keep track of the IDs, as multiple intervals that have the same endpoints
	 *   on both sides can be added. intervalInsertshould run in O(logn)time
	 * @param a
	 * @param b
	 */
	void intervalInsert(int a, int b) {
		insert(a, 1);
		insert(b, -1);
		
	}
	
	/**
	 * To delete an interval from delete.
	 * 
	 * 
	 * Deletes the interval whose ID (gener-ated byintervalInsert) isintervalID. Returnstrueif 
	 * deletion was successful. Thismethod should run inO(logn)time.Note.TheintervalDeletemethod 
	 * isoptional; that is, you are not requiredto implement it. However, your codemustprovide 
	 * anintervalDeletemethodeven if you choose not to implement interval deletion. If you do not
	 *  implementdeletion, theintervalDeletemethod should consist of just one line that returnsfalse.
	 * @param intervalID
	 * @return
	 */
	boolean intervalDelete(int intervalID) {
		//TODO: Complete it as needed (This is optional so you can leave it as it is)
		return false;
	}
	
	/**
	 * Finds the endpoint that has maximum overlap and returns its value. Thismethod should run in constant time.
	 * @return
	 */
	int findPOM() {
		RBTree tree = getRBTree();
		return tree.root.val;
	}
	
	/**
	 * Returns the red-black tree used, which is an object of typeRBTree.
	 * @return
	 */
	RBTree getRBTree() {
		//TODO: Modify it accordingly.
		return null;
	}
	
	
	//Add more functions as  you see fit.
	
	public void insert(int a, int side) {
		Node toInsert = new Node();
		toInsert.key = a;
		toInsert.p = side;
		toInsert.color = 0;
			
		
	}
	
	public void leftRotate (RBTree tree, Node node) {
		Node y = node.right;
		node.right = y.left;
		
		if(y.left != tree.NIL) {
			y.left.parent = node;
		}y.parent = node.parent;
		
		if(node.parent == tree.NIL) {
			tree.root = y;
		}else if(node == node.parent.left) {
			node.parent.left = y;
		}else {
			node.parent.right = y;
		}
		
		y.left = node;
		node.parent = y;
	}
	

	public void rightRotate (RBTree tree, Node node) {
		
		Node y = node.parent;
		y.left = node.right;
		if(node.right != null) {
			node.right.parent = y;
		}node.parent = y.parent;
		if(y.parent == null) {
			tree.root = node;
		}else if(y == y.parent.right) {
			y.parent.right = node;
		}else {
			y.parent.left = y;
		}
		
		
	}
	
	
	/**
	 * This is a suggested way on how to add intervals and call POM()
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		int points[][] = {{0, 4}, {1, 6}, {3, 9}, {7, 11}};
		Intervals intv = new Intervals();
		
		for(int i=0; i<points.length; i++) {
			//System.out.println("Inserting: "+ Arrays.toString(points[i]));
			intv.intervalInsert(points[i][0], points[i][1]);
		}
		System.out.println("POM is: "+ intv.findPOM()); //Should return 3.
	}
	
	
}
