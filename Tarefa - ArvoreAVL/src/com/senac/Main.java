package com.senac;

import com.senac.util.Node;
import com.senac.util.Tree;

public class Main {

	public static void main(String[] args) {
		Tree t = new Tree();
		Node n = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		t.insert(n);
		t.print();
		System.out.println();
		t.insert(n2);
		
		t.print();		
		t.insert(n3);		
		
		System.out.println();
		t.print();
		System.out.println();
		System.out.println(t.getRoot().getH());
		//System.out.println(t.getRoot().getValue());
	}
	
}