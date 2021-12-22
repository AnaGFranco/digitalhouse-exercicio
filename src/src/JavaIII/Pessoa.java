package src.JavaIII;

public class Pessoa implements Precedente<Pessoa>{

    private String name;
    private String cpf;

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.name.compareTo(pessoa.getName());
    }

    @Override
    public String toString(){
        return "Pessoa{ nome: " + this.name + " cpf: " + this.cpf + "}";
    }
}
