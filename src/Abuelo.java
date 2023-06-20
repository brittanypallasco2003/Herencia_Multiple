public class Abuelo {
    //ATRIBUTOS
    private String tipo_sangre;
    private String color_ojos;
    private String forma_cabello;

    //CONSTRUCTOR

    public Abuelo(String tipo_sangre, String color_ojos, String forma_cabello) {
        this.tipo_sangre = tipo_sangre;
        this.color_ojos = color_ojos;
        this.forma_cabello = forma_cabello;
    }

    //GETTERS Y SETTERS


    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
    }

    public String getForma_cabello() {
        return forma_cabello;
    }

    public void setForma_cabello(String forma_cabello) {
        this.forma_cabello = forma_cabello;
    }

}
