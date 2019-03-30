
  import org.junit.Before; import org.junit.Test;

  import static org.junit.Assert.*;

  public class RBOperationsTest {

  // Instance variables RBTree tree; Node node1; Node node2; Node node3; Node
  node4; Node node5; Node node6; Node node7; Node node8;

  @Before public void initialize() { tree = new RBTree(); node4 = new Node();
  node2 = new Node(); node7 = new Node(); node1 = new Node(); node3 = new
  Node(); node5 = new Node(); node8 = new Node(); node6 = new Node();

  node4.parent = tree.NIL; node4.left = node2; node4.right = node7; node4.key =
  4; node4.color = 1; node4.val = 0; node4.p = -1; node4.maxval = 3;
  //node.emax is fucked

  node2.parent = node4; node2.left = node1; node2.right = node3; node2.key = 1;
  node2.color = 0; node2.val = 3; node2.p = 1; node2.maxval = 3;

  node7.parent = node4; node7.left = node5; node7.right = node8; node7.key = 9;
  node7.color = 0; node7.val = -2; node7.p = -1; node7.maxval = 0;

  node1.parent = node2; node1.left = tree.NIL; node1.right = tree.NIL;
  node1.key = 0; node1.color = 1; node1.val = 1; node1.p = 1; node1.maxval = 1;

  node3.parent = node2; node3.left = tree.NIL; node3.right = tree.NIL;
  node3.key = 3; node3.color = 1; node3.val = 1; node3.p = 1; node3.maxval = 1;

  node5.parent = node7; node5.left = tree.NIL; node5.right = tree.NIL;
  node5.key = 6; node5.color = 1; node5.val = 0; node5.p = -1; node5.maxval =
  0;

  node8.parent = node7; node8.left = tree.NIL; node8.right = tree.NIL;
  node8.key = 11; node8.color = 1; node8.val = -1; node8.p = -1; node8.maxval =
  0;

  node1.left = tree.NIL; node1.right = tree.NIL; node6.key = 7; node6.color =
  0; node6.val = 1; node6.p = 1; node6.maxval = 1; }

  @Test public void firstInsert() { tree.RBInsert(node1);
  assertEquals(tree.getRoot().getKey(), 4);
  assertEquals(tree.getRoot().getColor(), 0); }

  @Test public void leftInsert() { tree.RBInsert(node2); tree.RBInsert(node1);
  assertEquals(tree.getRoot().getKey(), 2);
  assertEquals(tree.getRoot().getColor(), 1);
  assertEquals(tree.getRoot().getLeft().getKey(), 0);
  assertEquals(tree.getRoot().getLeft().getColor(), 1);

  }

  @Test public void rightInsert() { tree.RBInsert(node2); tree.RBInsert(node3);
  assertEquals(tree.getRoot().getKey(), 2);
  assertEquals(tree.getRoot().getColor(), 1);
  assertEquals(tree.getRoot().getRight().getKey(), 3);
  assertEquals(tree.getRoot().getRight().getColor(), 1);

  }

  @Test public void leftRightInsert() {

  // Build tree tree.RBInsert(node2); tree.RBInsert(node1);
  tree.RBInsert(node3);

  // Test initial insertion assertEquals(tree.getRoot().getKey(),
  node2.getKey()); assertEquals(tree.getRoot().getColor(), 0);

  // Test root's children Node left = tree.getRoot().getLeft(); Node right =
  tree.getRoot().getRight(); assertEquals(left.getKey(), node1.getKey());
  assertEquals(right.getKey(), node3.getKey());
  assertEquals(left.getParent().getKey(), node2.getKey());
  assertEquals(right.getParent().getKey(), node2.getKey());
  assertEquals(left.getColor(), 1); assertEquals(right.getColor(), 1);



  }

  @Test public void insertWithLeftRotation() {

  // Build tree tree.RBInsert(node1); tree.RBInsert(node2);
  tree.RBInsert(node3);

  // Test root after rotation assertEquals(tree.getRoot().getKey(), 2);
  assertEquals(tree.getRoot().getColor(), 0);

  // Test children Node left = tree.getRoot().getLeft(); Node right =
  tree.getRoot().getRight(); assertEquals(left.getKey(), 1);
  assertEquals(right.getKey(), 3); assertEquals(left.getParent(),
  tree.getRoot()); assertEquals(right.getParent(), tree.getRoot());
  assertEquals(left.getColor(), 1); assertEquals(right.getColor(), 1);


  }

  @Test public void insertWithRightRotation() {

  // Build tree tree.RBInsert(node3); tree.RBInsert(node2);
  tree.RBInsert(node1);

  // Test root after rotation assertEquals(tree.getRoot().getKey(), 2);
  assertEquals(tree.getRoot().getColor(), 0);

  // Test children Node left = tree.getRoot().getLeft(); Node right =
  tree.getRoot().getRight(); assertEquals(left.getKey(), 1);
  assertEquals(right.getKey(), 3); assertEquals(left.getParent(),
  tree.getRoot()); assertEquals(right.getParent(), tree.getRoot());
  assertEquals(left.getColor(), 1); assertEquals(right.getColor(), 1); }

  @Test public void insertCase3() {

  // Build tree to create case 3 scenario (from Wikipedia)
  tree.RBInsert(node3); tree.RBInsert(node2); tree.RBInsert(node4);
  tree.RBInsert(node1);

  // Test if colors were repainted correctly
  assertEquals(tree.getRoot().getColor(), 0);
  assertEquals(tree.getRoot().getLeft().getColor(), 0);
  assertEquals(tree.getRoot().getRight().getColor(), 0);
  assertEquals(tree.getRoot().getLeft().getLeft().getColor(), 1); }

  @Test public void insertCase4() {

  // Build tree to create case 4 scenario (from Wikipedia)
  tree.RBInsert(node3); tree.RBInsert(node1); tree.RBInsert(node4);
  tree.RBInsert(node2);

  // Test rotations assertEquals(tree.getRoot().getKey(), 2);
  assertEquals(tree.getRoot().getLeft().getKey(), 1);
  assertEquals(tree.getRoot().getRight().getKey(), 3);
  assertEquals(tree.getRoot().getRight().getRight().getKey(), 4);


  // Test colors assertEquals(tree.getRoot().getColor(), 1);
  assertEquals(tree.getRoot().getLeft().getColor(), 1);
  assertEquals(tree.getRoot().getRight().getColor(), 1);
  assertEquals(tree.getRoot().getRight().getRight().getColor(), 0); } }
