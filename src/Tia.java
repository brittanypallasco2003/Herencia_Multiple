public class Tia extends Abuelo{
    //ATRIBUTOS
    private int medida_cabello;
    private String rizos;

    public Tia(String tipo_sangre, String color_ojos, String forma_cabello, int medida_cabello, String rizos) {
        super(tipo_sangre, color_ojos, forma_cabello);
        this.medida_cabello = medida_cabello;
        this.rizos = rizos;
    }

    public int getMedida_cabello() {
        return medida_cabello;
    }

    public void setMedida_cabello(int medida_cabello) {
        this.medida_cabello = medida_cabello;
    }

    public String getRizos() {
        return rizos;
    }

    public void setRizos(String rizos) {
        this.rizos = rizos;
    }
}
