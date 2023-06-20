public class Padre extends Abuelo {
    //ATRIBUTOS
    String color_cabello;
    String color_piel;



    //CONSTRUCTOR
    public Padre(String tipo_sangre, String color_ojos, String forma_cabello, String color_cabello, String color_piel) {
        super(tipo_sangre, color_ojos, forma_cabello);
        this.color_cabello=color_cabello;
        this.color_piel=color_piel;
    }
    //GETTERS Y SETTERS

    public String getColor_cabello() {
        return color_cabello;
    }

    public void setColor_cabello(String color_cabello) {
        this.color_cabello = color_cabello;
    }

    public String getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(String color_piel) {
        this.color_piel = color_piel;
    }
}
