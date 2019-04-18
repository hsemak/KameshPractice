package com.kamesh.KameshPractice;

import java.util.LinkedList;

public class BinaryTreeSumLeafNode {

	Node root; 
	  
    // helper function to check if a Node is leaf of tree 
    boolean isLeaf(Node node) 
    { 
        return ((node.left == null) && (node.right == null)); 
    } 
  
    /* Calculate sum of all leaf Nodes at each level and returns 
     multiplication of sums */
    int sumAndMultiplyLevelData() 
    { 
        return sumAndMultiplyLevelData(root); 
    } 
    int sumAndMultiplyLevelData(Node node) 
    { 
        // Tree is empty 
        if (node == null) { 
            return 0; 
        } 
  
        int mul = 1; /* To store result */
  
        // Create an empty queue for level order tarversal 
        LinkedList<Node> q = new LinkedList<Node>(); 
  
        // Enqueue Root and initialize height 
        q.add(node); 
  
        // Do level order traversal of tree 
        while (true) { 
  
            // NodeCount (queue size) indicates number of Nodes 
            // at current lelvel. 
            int NodeCount = q.size(); 
  
            // If there are no Nodes at current level, we are done 
            if (NodeCount == 0) { 
                break; 
            } 
  
            // Initialize leaf sum for current level 
            int levelSum = 0; 
  
            // A boolean variable to indicate if found a leaf 
            // Node at current level or not 
            boolean leafFound = false; 
  
            // Dequeue all Nodes of current level and Enqueue all 
            // Nodes of next level 
            while (NodeCount > 0) { 
                Node node1; 
                node1 = q.poll(); 
  
                /* if Node is a leaf, update sum at the level */
                if (isLeaf(node1)) { 
                    leafFound = true; 
                    levelSum += node1.data; 
                } 
  
                // Add children of Node 
                if (node1.left != null) { 
                    q.add(node1.left); 
                } 
                if (node1.right != null) { 
                    q.add(node1.right); 
                } 
                NodeCount--; 
            } 
  
            // If we found at least one leaf, we multiply 
            // result with level sum. 
            if (leafFound) { 
                mul *= levelSum; 
            } 
        } 
  
        return mul; // Return result 
    } 
  
    public static void main(String args[]) 
    { 
  
        /* creating a binary tree and entering  
         the nodes */
    	BinaryTreeSumLeafNode tree = new BinaryTreeSumLeafNode(); 
        tree.root = new Node(2); 
        tree.root.left = new Node(7); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(8); 
        tree.root.left.right = new Node(6); 
        tree.root.left.right.left = new Node(1); 
        tree.root.left.right.right = new Node(11); 
        tree.root.right.right = new Node(9); 
        tree.root.right.right.left = new Node(4); 
        tree.root.right.right.right = new Node(10); 
        System.out.println("The final product value : "
                           + tree.sumAndMultiplyLevelData()); 
    } 

}
