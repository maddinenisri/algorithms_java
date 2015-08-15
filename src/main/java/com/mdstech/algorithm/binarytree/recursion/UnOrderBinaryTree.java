package com.mdstech.algorithm.binarytree.recursion;

public class UnOrderBinaryTree {

	private TreeNode rootNode;
	
	public void addTreeNode(Integer index, String name) {
		//If root node is null, create root node
		if(rootNode == null) {
			rootNode = new TreeNode(index, name);
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
		}
		else if(parentNode.getRightNode() == null) {
			parentNode.setRightNode(new TreeNode(index, name));
			parentNode.setFullNode(true);
			isNodeInserted = true;
		}
		
		if(!isNodeInserted) {
			addRecursiveTreeNode(findParetNodeToAddNode(parentNode), index, name);
		}
	}
	
	private TreeNode findParetNodeToAddNode(TreeNode currentMarkerNode) {
		TreeNode currentNode = null;
		if(currentMarkerNode.getLeftNode().isFullNode() && !currentMarkerNode.getRightNode().isFullNode()) {
			currentNode = currentMarkerNode.getRightNode();
		}
		else {
			currentNode = currentMarkerNode.getLeftNode();
		}
		return currentNode;
	}

	public TreeNode getRootNode() {
		return rootNode;
	}
}
