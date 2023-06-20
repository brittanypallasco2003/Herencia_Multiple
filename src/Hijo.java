public class Hijo extends Padre{
    //ATRIBUTOS
    String tipo_cabello;
    String grosor_cejas;

    public Hijo(String tipo_cabello, String grosor_cejas) {
        super();
        this.tipo_cabello = tipo_cabello;
        this.grosor_cejas = grosor_cejas;
    }

    public Hijo() {
        super();

    }

    public String getTipo_cabello() {
        return tipo_cabello;
    }

    public void setTipo_cabello(String tipo_cabello) {
        this.tipo_cabello = tipo_cabello;
    }

    public String getGrosor_cejas() {
        return grosor_cejas;
    }

    public void setGrosor_cejas(String grosor_cejas) {
        this.grosor_cejas = grosor_cejas;
    }
}
