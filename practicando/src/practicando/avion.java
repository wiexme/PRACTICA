
package practicando;

/**
 *
 * @author WIEXME
 */
public class avion extends piloto implements pasajero{

    @Override
    public void procesar(String pago) {
        if (this.Pasaje(pago)) {
            this.NumeroAsiento();
            
        } else {
            this.mensaje();
        }
    }
    
    public void mensaje(){
        System.out.println("Usted no pago su pasaje....");
    }

    @Override
    public void NumeroAsiento() {
        System.out.println("Su asciento es el el 34....");
    }

    @Override
    public boolean Pasaje(String pago) {
        boolean validar = false;
        if (pago.equals("si")) {
            this.Presentarse();
            this.NumeroAsiento();
            
        } else {
            this.mensaje();
        }
        return validar;
    }

  

    
    
    
}
