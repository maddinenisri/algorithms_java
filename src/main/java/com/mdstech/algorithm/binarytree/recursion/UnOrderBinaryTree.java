package com.mdstech.algorithm.binarytree.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class UnOrderBinaryTree {

	private TreeNode rootNode;
	private Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
	
	public void addTreeNode(Integer index, String name) {
		//If root node is null, create root node
		if(rootNode == null) {
			rootNode = new TreeNode(index, name);
			treeQueue.add(root);
		}
		else {
			addRecursiveTreeNode(rootNode, index, name);
		}
	}

	private void addRecursiveTreeNode(TreeNode parentNode, Integer index, String name) {
		boolean isNodeInserted = false;
		if(parentNode.getLeftNode() == null) {
			parentNode.setLeftNode(new TreeNode(index, name));
			isNodeInserted = true;
			treeQueue.add(parentNode.getLeftNode());
		}
		else if(parentNode.getRightNode() == null) {
			parentNode.setRightNode(new TreeNode(index, name));
			isNodeInserted = true;
			parentNode.setFullNode(true);
			treeQueue.add(parentNode.getRightNode());
		}
		
		if(!isNodeInserted) {
			addRecursiveTreeNode(findParetNodeToAddNode(), index, name);
		}
	}
	
	private TreeNode findParetNodeToAddNode() {
		if(treeQueue.element().isFullNode()) {
			treeQueue.remove();
		}
		TreeNode parentNode = treeQueue.element();
		return parentNode;
	}
	
	private TreeNode findParetNodeToAddNode(TreeNode currentMarkerNode) {
		TreeNode currentNode = null;
		if(currentMarkerNode.getLeftNode().isFullNode() && !currentMarkerNode.getRightNode().isFullNode()) {
			currentNode = currentMarkerNode.getRightNode();
		}
		currentNode = currentMarkerNode.getLeftNode();
		return currentNode;
	}

	public TreeNode getRootNode() {
		return rootNode;
	}
}
