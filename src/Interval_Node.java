/**
 * Team members:
 * @author Lauren Arner
 * @author Richard Smith
 * @author Justin Sung
 *
 * Node class for RBTree.
 */
public class Interval_Node {

	public int leftEndpoint;
	public int rightEndpoint;
  public int intervalIndex;


	public Interval_Node() {

	this.leftEndpoint = -1;
  this.rightEndpoint = -1;
  this.intervalIndex = 0;

	}

	public int getLeftEndpoint() {
    return leftEndpoint;
  }

  public int getRightEndpoint() {
    return rightEndpoint;
  }

  public int getIntervalIndex() {
    return intervalIndex;
  }

  public void setLeftEndpoint(int left) {
    leftEndpoint = left;
  }

  public void setRightEndpoint(int right) {
    rightEndpoint = right;
  }

  public void setIntervalIndex(int i) {
    intervalIndex = i;
  }

}
