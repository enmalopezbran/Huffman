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
public class Node
{
    public int frequency;
    public char c;
    public Node left;
    public Node right;
    
    public Node(int frequency, char c, Node left, Node right)
    {
        this.frequency = frequency;
        this.c = c;
        this.left = left;
        this.right = right;
    }
    
    public Node()
    {
        //does Nothing
    }
    
    public Node addNode(Node node1, Node node2)
    {
        if(node1.frequency < node2.frequency)
        {
            left = node1;
            right = node2;
        }
        else
        {
            right = node1;
            left = node2;
        }
        frequency = node1.frequency + node2.frequency;
        
        return this;
    }
    
}
