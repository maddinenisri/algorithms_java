package com.mdstech.algorithm.binarytree.recursion;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * This class represents Binary Tree node structure for Unordered binary tree.
 * Used recursion for tree construction.
 * 
 * @author Srini Maddineni
 *
 */
public class TreeNode {

	private final Integer index;
	private final String name;

	private TreeNode leftNode;
	private TreeNode rightNode;
	private boolean fullNode;

	public TreeNode(final Integer index, final String name) {
		this.index = index;
		this.name = name;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public boolean isFullNode() {
		return fullNode;
	}

	public void setFullNode(boolean fullNode) {
		this.fullNode = fullNode;
	}

	public Integer getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}
	
	public void printTree(OutputStreamWriter outputStreamWriter) throws IOException {
		if(rightNode != null) {
			rightNode.printTree(outputStreamWriter, true, "");
		}
		printNodeValue(outputStreamWriter);
		if(leftNode != null) {
			leftNode.printTree(outputStreamWriter, false, "");
		}
	}

	private void printTree(OutputStreamWriter outputStreamWriter, boolean isRight, String indent) throws IOException {
		if(rightNode != null) {
			rightNode.printTree(outputStreamWriter, true, indent + (isRight ? "        " : " |      "));
		}
		outputStreamWriter.write(indent);
		if (isRight) {
			outputStreamWriter.write(" /");
        } else {
        	outputStreamWriter.write(" \\");
        }
		outputStreamWriter.write("----- ");
        printNodeValue(outputStreamWriter);
        if (leftNode != null) {
            leftNode.printTree(outputStreamWriter, false, indent + (isRight ? " |      " : "        "));
        }
	}

	private void printNodeValue(OutputStreamWriter outputStreamWriter) throws IOException {
		if (name == null) {
            outputStreamWriter.write("<null>");
        } else {
            outputStreamWriter.write(name+"["+index+"]");
        }
        outputStreamWriter.write('\n');		
	}
	
	
}
