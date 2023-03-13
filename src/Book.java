public  class Book {
    public String nazvanie;
    public String soderjanie;
    public String avtor;
    public int skolkoStranic;
    public int vesKnigi;

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getSoderjanie() {
        return soderjanie;
    }

    public void setSoderjanie(String soderjanie) {
        this.soderjanie = soderjanie;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getSkolkoStranic() {
        return skolkoStranic;
    }

    public void setSkolkoStranic(int skolkoStranic) {
        this.skolkoStranic = skolkoStranic;
    }

    public int getVesKnigi() {
        return vesKnigi;
    }

    public void setVesKnigi(int vesKnigi) {
        this.vesKnigi = vesKnigi;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nazvanie='" + nazvanie + '\'' +
                ", soderjanie='" + soderjanie + '\'' +
                ", avtor='" + avtor + '\'' +
                ", skolkoStranic=" + skolkoStranic +
                ", vesKnigi=" + vesKnigi +
                '}';
    }
}
