public class Primo extends Tia {
    //ATRIBUTOS
    private String forma_boca;
    private int tam_barba;

    public Primo(String tipo_sangre, String color_ojos, String forma_cabello, int medida_cabello, String rizos, String forma_boca, int tam_barba) {
        super(tipo_sangre, color_ojos, forma_cabello, medida_cabello, rizos);
        this.forma_boca = forma_boca;
        this.tam_barba = tam_barba;
    }

    public String getForma_boca() {
        return forma_boca;
    }

    public void setForma_boca(String forma_boca) {
        this.forma_boca = forma_boca;
    }

    public int getTam_barba() {
        return tam_barba;
    }

    public void setTam_barba(int tam_barba) {
        this.tam_barba = tam_barba;
    }
}
