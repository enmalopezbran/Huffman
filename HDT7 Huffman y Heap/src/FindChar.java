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
public class FindChar 
{
    private Node nodoRaiz;
    private String myString;
    private char c;
    public FindChar(String input, Node myNode)
    {
        nodoRaiz = myNode;
        myString = input;
        c = encontrar(myString, nodoRaiz);
    }
    
    public char encontrar(String codigo, Node nodo)
    {
        char letra;
        char now;
        int i;
        if (nodo != null)
        {
           for(i = 0; i < myString.length()-1; i++)
           {
               now = codigo.charAt(i);
               if (now == 1)
               {
                   nodo= nodo.right;
               }
               else if (now == 0)
               {
                   nodo = nodo.left;
               }
           }   
        }
        
        //letra = nodo.c;
        letra = 'C';
        return letra;
    }
}
