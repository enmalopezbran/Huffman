/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author enmalopezbran
 */
public class Arbol extends Nodo{
    private Nodo root;
    
    public Arbol(){
    root = null;
    }
    public Arbol(Nodo nodo1, Nodo nodo2){
    root = super.agregarNodo(nodo1, nodo2);
    }
    public void agregarNodo(int frec, char c){
        root.frecuencia =frec;
        root.chr = c;
        root.izq =null;
        root.der = null;
    
    }
    public void agregarNodo(Nodo nodo){
        this.root.frecuencia = nodo.frecuencia;
        this.root.chr = nodo.chr;
        this.root.izq = nodo.izq;
        this.root.der = nodo.der;
    }
    
    //public void agregarNodo(Nodo nodo1, Nodo nodo2){
      //  root = super.agregarNodo(nodo1, nodo2);
        
    //}
}