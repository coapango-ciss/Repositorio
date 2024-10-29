public class SinglyLinkedList {
    Nodo cabeza;
    public SinglyLinkedList(){
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(cabeza == null){
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while(temp.getSiguiente() != null){
                temp =  temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
    
    public void mostrar(){
    }
}
