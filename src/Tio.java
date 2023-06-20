public class Tio extends Abuelo {
    //ATRIBUTOS
    String color_unas;
    String forma_cejas;

    //CONSTRUCTOR
    public Tio(String tipo_sangre, String color_ojos, String forma_cabello, String color_unas, String forma_cejas) {
        super(tipo_sangre, color_ojos, forma_cabello);
        this.color_unas=color_unas;
        this.forma_cejas=forma_cejas;
    }
    //GETTERS Y SETTERS

    public String getColor_unas() {
        return color_unas;
    }

    public void setColor_unas(String color_unas) {
        this.color_unas = color_unas;
    }

    public String getForma_cejas() {
        return forma_cejas;
    }

    public void setForma_cejas(String forma_cejas) {
        this.forma_cejas = forma_cejas;
    }
}
