/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Diego Fernando Rivera Escobar 15085
 * Programación orientada a objetos
 */
public class Tree extends Node
{
    private Node root;
    
    public Tree()
    {
        root = null;
    }
    
    public Tree(Node node1, Node node2)
    {
        root = super.addNode(node1, node2);
    }
    
    public void insertNode(int freq, char c)
    {
        root.frequency =  freq;
        root.c = c;
        root.left = null;
        root.right = null;
    }
    
    public void insertNode(int freq, char c, Node left, Node right)
    {
        root.frequency =  freq;
        root.c = c;
        this.root.left = left;
        this.root.right = right;
    }
    
    public void insertNode(Node node)
    {
        this.root.frequency = node.frequency;
        this.root.c = node.c;
        this.root.left = node.left;
        this.root.right = node.right;
    }
    
    public void insertNode(Node node1, Node node2)
    {
        root = super.addNode(node1, node2);   
    }
}

