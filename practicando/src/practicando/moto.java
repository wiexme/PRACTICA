

package practicando;


public class moto extends vehiculo{
    int numvocina;

    public moto(int numvocina, String marca) {
        this.numvocina = numvocina;
        this.marca = marca;
    }
    
    public void comenzar() {
        this.Encender(marca);
        
        
    }
    
    
    
}
