package com.mdstech.algorithm.binarytree.recursion;

import java.io.OutputStreamWriter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnOrderBinaryTreeTest {

	@Test
	public void testUnOrderBinaryTreeCreation() throws Exception {
		UnOrderBinaryTree unOrderBinaryTree = new UnOrderBinaryTree();
		unOrderBinaryTree.addTreeNode(1, "Test1");
		unOrderBinaryTree.addTreeNode(2, "Test2");
		unOrderBinaryTree.addTreeNode(3, "Test3");
		unOrderBinaryTree.addTreeNode(4, "Test4");
		unOrderBinaryTree.addTreeNode(5, "Test5");
		unOrderBinaryTree.addTreeNode(6, "Test6");
		unOrderBinaryTree.addTreeNode(7, "Test7");
		unOrderBinaryTree.addTreeNode(8, "Test8");
		unOrderBinaryTree.addTreeNode(9, "Test9");
		unOrderBinaryTree.addTreeNode(10, "Test10");
		unOrderBinaryTree.addTreeNode(11, "Test11");
		unOrderBinaryTree.addTreeNode(12, "Test12");
		unOrderBinaryTree.addTreeNode(13, "Test13");
		unOrderBinaryTree.addTreeNode(14, "Test14");
		unOrderBinaryTree.addTreeNode(15, "Test15");
		unOrderBinaryTree.addTreeNode(16, "Test16");
		unOrderBinaryTree.addTreeNode(17, "Test17");
		unOrderBinaryTree.addTreeNode(18, "Test18");
		
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		unOrderBinaryTree.getRootNode().printTree(out);
		out.flush();
		out.close();
	}
}
