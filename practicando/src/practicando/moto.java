

package practicando;


public class moto extends vehiculo{
    String marca;

    public moto(String marca) {
        this.marca = marca;
    }
    
    public void comenzar() {
        this.Encender(marca);
        
        
    }
    
    
    
}
