package TFI01;

public class Espectadores extends Personas {

    private String fila;
    private int silla;



    public Espectadores(String nombre, String fila, int silla, int edad){
        this.fila=fila;
        super.nombre=nombre;
        super.edad=edad;
        this.silla=silla;
    }

    @Override
    public String toString() {
        return "Espectador: "+nombre+", edad: "+edad+", fila: "+fila+", butaca: "+this.getButaca()+".";
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    public String getButaca(){
        return "Fila: "+fila+" Silla: "+silla;
    }
}
