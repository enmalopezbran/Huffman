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
public class BusquedaArbol
{
    private Node nodoRaiz;
    private char c;
    private char charArray[];
    private int i=0;
    public String patron = "";
    public BusquedaArbol(Node myNode, char [] charArray)
    {
        String temp;
        int i;
        nodoRaiz = myNode;
        this.charArray = charArray;
        for(i = 0; i < charArray.length; i++)
        {
            temp = buscar(nodoRaiz, "", charArray[i]);
            patron += temp+" ";
            System.out.println("My values: "+charArray[i]+" "+temp+" "+nodoRaiz.frequency);
        }
    }
    
    public String buscar(Node nodoRaiz, String value,char myChar)
    {
        String valor ="";
        if(nodoRaiz != null)
        {
            if(nodoRaiz.left != null)
                valor = buscar(nodoRaiz.left, value+"0", myChar);
            if(nodoRaiz.c == myChar)
                return value;

            else
            {
                if("".equals(valor))
                {
                    return buscar(nodoRaiz.right, value+"1",myChar);
                }
                else
                {
                    return valor;
                }
            }
        }
        else
        {
            return "";
        }
    }
        
}
