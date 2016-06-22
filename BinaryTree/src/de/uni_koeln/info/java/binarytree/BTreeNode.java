package de.uni_koeln.info.java.binarytree;

public class BTreeNode<T extends Comparable<T>> {

	private BTreeNode<T> left;
	private BTreeNode<T> right;
	private T value;
	
	public BTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BTreeNode<T> left) {
		this.left = left;
	}

	public BTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BTreeNode<T> right) {
		this.right = right;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BTreeNode(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
