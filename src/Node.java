/**
 * Team members:
 * @author Lauren Arner
 * @author Richard Smith
 * @author Justin Sung
 * 
 * Node class for RBTree.
 */
public class Node {
	
	public Node parent;
	public Node left;
	public Node right;
	public int key;
	public int color;
	public int val;
	public Endpoint endpoint;
	public int p;
	public int maxval;
	public Endpoint emax;
	
	public Node() {
		this.parent = null;
		this.left = null;
		this.right = null;
		this.key = 0;
		this.color = 0;
		this.val = 0;
		this.endpoint = null;
		this.p = 0;
		this.maxval=-1;
		this.emax = null;
		
		
	}
	
	/**
	 * Returns the parent of this node.
	 * @return
	 */
	public Node getParent() {
		
		return parent;
	}
	
	/**
	 * Returns the left child.
	 * @return
	 */
	public Node getLeft() {
		return left;
	}
	
	/**
	 * Returns the right child.
	 * @return
	 */
	public Node getRight() {
		return right;
	}
	
	/**
	 * Returns the endpoint value, which is an integer.
	 * @return
	 */
	public int getKey() {
		return key;
	}
	
	/**
	 * Returns the value of the functionpbased on this endpoint.
	 * @return
	 */
	public int getP() {
		return p;
	}
	
	/**
	 * Returns the val of the node as described in this assignment.
	 * @return
	 */
	public int getVal() {
		return val;
	}
	
	/**
	 * Returns themaxvalof the node as described in this assignment.
	 * @return
	 */
	public int getMaxVal() {
		return maxval;
	}
	
	/**
	 * Returns theEndpointobject that this node represents.
	 * @return
	 */
	public Endpoint getEndpoint() {
		return endpoint;
	}
	
	/**
	 * Returns anEndpointobject that represents emax. 
	 * Calling this method on the root node will give the End point object whose getValue() 
	 * provides a point of maximum overlap.
	 * @return
	 */
	public Endpoint getEmax() {
		return emax;
	}
	
	/**
	 * Returns 0 if red. Returns 1 if black.
	 * @return
	 */
	public int getColor() {
		return color;
	}
	
	//Add more functions as  you see fit.
	
	
}
