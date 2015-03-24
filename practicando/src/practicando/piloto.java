

package practicando;


public abstract class piloto {
    
    int edad= 20;
    String nombre="Geseñi Trigozo";
    String rango="Capitan";
    
    public void Presentarse(){
        System.out.print("Hola mi nombre es: "+this.nombre+".  Mi edad es: "+this.edad+" Y soy el rango: "+this.rango);
    }
    
}
