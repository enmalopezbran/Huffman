public class BusquedaArbol
{
    private Node nodoRaiz;
    private char chr;
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
    
    public String buscar(Node nodoRaiz, String value,char miChar)
    {
        String valor ="";
        if(nodoRaiz != null)
        {
            if(nodoRaiz.left != null)
                valor = buscar(nodoRaiz.left, value+"0", miChar);
            if(nodoRaiz.chr == miChar)
                return value;

            else
            {
                if("".equals(valor))
                {
                    return buscar(nodoRaiz.right, value+"1",miChar);
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
    
