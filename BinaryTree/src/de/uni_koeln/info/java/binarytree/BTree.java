package de.uni_koeln.info.java.binarytree;
import java.util.ArrayList;
import java.util.List;

public class BTree<T extends Comparable<T>> {
	
	private BTreeNode<T> root;
	private ArrayList<T> sortedList;
	
	 public BTree(T value) {
		 root = new BTreeNode<T>(value);
	 }

	 public boolean insert(T value) {
		if (root == null) {
			root = new BTreeNode<T>(value);
			return true;
		}
		else return insert(root, value);
	 }

	private boolean insert(BTreeNode<T> currentNode, T value) {
		if (value.compareTo(currentNode.getValue()) < 0) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(new BTreeNode<T>(value));
			} else
				insert(currentNode.getLeft(), value);
		} else if (value.compareTo(currentNode.getValue()) > 0) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(new BTreeNode<T>(value));
			} else
				insert(currentNode.getRight(), value);
		} else return false;
		return true;
	}

	public void print() {
		if (root != null)
			print(root);
	}

	private void print(BTreeNode currentNode) {
		// l
		if (currentNode.getLeft() != null)
			print(currentNode.getLeft());
		// W
		System.out.println(currentNode.getValue());
		// r
		if (currentNode.getRight() != null)
			print(currentNode.getRight());
	}
	
	public boolean contains(T value) {
		BTreeNode<T> currentNode = root;
		while (true) {
			if (value.compareTo(currentNode.getValue()) < 0) {
				if (currentNode.getLeft().getValue().compareTo(value) < 0) return false;
				currentNode = currentNode.getLeft();
			} else if (value.compareTo(currentNode.getValue()) > 0) {
				if (currentNode.getRight().getValue().compareTo(value) > 0) return false;
				currentNode = currentNode.getRight();
			} else {
				return true;
			}
		}
	}
	
	private void addToSortedList(BTreeNode<T> node){
		if (node.getLeft() != null)
			addToSortedList(node.getLeft());
		sortedList.add(node.getValue());
		if (node.getRight() != null)
			addToSortedList(node.getRight());
	}

	public ArrayList<T> asSortedList() {
		sortedList = new ArrayList<T>();
		addToSortedList(root);
		return sortedList;
	}

	public List<T> elementsSmallerThan(T value) {
		sortedList = asSortedList();
		ArrayList<T> smallerThan = new ArrayList<T>();
		for (T t : sortedList){
			if (t.compareTo(value) < 0){
				smallerThan.add(t);
			} else break;
		}
		return smallerThan;
	}


}
