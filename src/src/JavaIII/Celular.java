package src.JavaIII;

public class Celular implements Precedente<Celular> {

    private String celular;

    public String getCelular() {
        return celular;
    }

    public Celular(String celular) {
        this.celular = celular;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.celular.compareTo(celular.getCelular());
    }

    @Override
    public String toString(){
        return "celular: " + this.celular;
    }
}
