package com;

public class Tree {
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
	}
			
	static class Tree {
		static int idx = -1;
		public static Node buildtree(int  nodes[]) {
			idx++;
			if (idx >= nodes.length || nodes[idx] == -1)
				return null;
		}
		
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = builTree(nodes);
		
		return newNode;
	}
	
  public static void preorder(Node root) {
	 if(root == null) {
		 return;
	 }
		  
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		 }
	 }
 	
 	public
 }
		}
	}


