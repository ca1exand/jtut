package de.uni_koeln.info.java;

import java.util.List;

import de.uni_koeln.info.java.binarytree.BTree;

public class Application {

	public static void main(String[] args) {

		BTree bTree = new BTree("hey");
		System.out.println(bTree.insert("yo"));
		System.out.println(bTree.insert("ola"));
		System.out.println(bTree.insert("hey"));
		System.out.println(bTree.insert("servus"));
//		bTree.insert(45);
//		bTree.insert(13);
//		bTree.insert(24);
//		bTree.insert(-1);
//		bTree.insert(10);
//		bTree.insert(1000);
//		bTree.insert(99);

		bTree.print();

		List<Integer> asSortedList = bTree.asSortedList();
		System.out.println(asSortedList);
		System.out.println("**********************");
		
		List<Integer> elementsSmallerThan = bTree.elementsSmallerThan("peter");
		System.out.println(elementsSmallerThan);
		System.out.println("**********************");

		System.out.println(bTree.contains("no"));
		System.out.println(bTree.contains("yo"));
		System.out.println("**********************");
		
	}

}
