
import java.util.ArrayList;
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
	private RBTree tree = new RBTree();
	private  int a, b;
	private int intervalID = 0;
	private ArrayList<Endpoint> endpointList = new ArrayList<Endpoint>();
	private Intervals[] intervalNodes = new Intervals[20];



	/**
	 * Constructor with no parameters.
	 */
	public Intervals() {
		this.a = 0;
		this.b = 0;
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
		intervalID++;
		insert(a, 1);
		insert(b, -1);	
		
		//adds endpoints into endpoint array list
		Endpoint point1 = new Endpoint(a);
		Endpoint point2 = new Endpoint(b);
		endpointList.add(point1);
		endpointList.add(point2);
		
		
		
		//custom in order method resets val and maxval for every new insertion 
		tree.inOrder(tree.getRoot());
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
		return tree;
	}


	//Add more functions as  you see fit.

	/**
	 * custom insert function to help set up interval insert
	 * @param a
	 * @param side
	 */
	public void insert(int a, int side) {
		Node toInsert = new Node();
		toInsert.key = a;
		toInsert.p = side;
		toInsert.color = 0;
		tree.RBInsert(toInsert);
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
