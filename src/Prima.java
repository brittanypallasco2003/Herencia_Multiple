public class Prima extends Tia {
    //ATRIBUTOS
    private String forma_orejas;
    private String lobulo;

    public Prima(String tipo_sangre, String color_ojos, String forma_cabello, int medida_cabello, String rizos, String forma_orejas, String lobulo) {
        super(tipo_sangre, color_ojos, forma_cabello, medida_cabello, rizos);
        this.forma_orejas = forma_orejas;
        this.lobulo = lobulo;
    }

    public String getForma_orejas() {
        return forma_orejas;
    }

    public void setForma_orejas(String forma_orejas) {
        this.forma_orejas = forma_orejas;
    }

    public String getLobulo() {
        return lobulo;
    }

    public void setLobulo(String lobulo) {
        this.lobulo = lobulo;
    }
}
