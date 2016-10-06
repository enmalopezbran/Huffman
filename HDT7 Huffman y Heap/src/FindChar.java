/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Diego Fernando Rivera Escobar 15085
 *Enma Lopez 15122
 * Programación orientada a objetos
 */
public class FindChar 
{
    private Nodo nodoRaiz;
    private String myString;
    private char c;
    public FindChar(String input, Nodo miNodo)
    {
        nodoRaiz = miNodo;
        myString = input;
        c = encontrar(myString, nodoRaiz);
    }
    
    public char encontrar(String codigo, Nodo nodo)
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
                   nodo= nodo.der;
               }
               else if (now == 0)
               {
                   nodo = nodo.izq;
               }
           }   
        }
        
        //letra = nodo.c;
        letra = 'C';
        return letra;
    }
}
