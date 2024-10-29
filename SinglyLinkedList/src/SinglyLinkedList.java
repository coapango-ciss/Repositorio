public class SinglyLinkedList {
    Nodo cabeza;
    public SinglyLinkedList(Nodo cabeza){
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
        Nodo temp = cabeza;
        while(temp != null){
            System.out.println(temp.getDato() + "->");
            temp.getSiguiente();
        }
        System.out.println("null");
    }
    public boolean buscar(Integer valor){
        if(cabeza == null){
            System.out.println("La lista está vacía");
        } else {
            Nodo temp = cabeza;
            while (temp != null) {
                if(temp.getDato() == valor){
                    System.out.println("Se ha encontrado el nodo");
                    return true;
                }
                temp = temp.getSiguiente();
            }
            System.out.println("El nodo con el valor buscado no está en la lista");
        }
        return false;
    }
    public void eliminar(Integer valor){
        if(cabeza == null){
            System.out.println("No se puede eliminar porque la lista está vacía");
        }
        if(cabeza.getDato() == valor){
            cabeza = cabeza.getSiguiente();
            System.out.println("Se elimino correctamente el valor" + valor);
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while(temp != null && temp.getDato() != valor){
            anterior = temp;
            temp =  temp.getSiguiente();
        }
        if(temp == null){
            System.out.println("No se encontró el valor");
            return;
        }
        anterior.setSiguiente(temp.getSiguiente());
        System.out.println("Se elimino correctamente el valor" + valor);
    }
}
