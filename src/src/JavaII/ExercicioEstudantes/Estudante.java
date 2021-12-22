package src.JavaII.ExercicioEstudantes;

import java.time.LocalDate;

public class Estudante {
    private String nome;
    private LocalDate dataNasc;
    private int nroMatricula;
    private int serie;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    public int getNroMatricula() {
        return nroMatricula;
    }
    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }
    public Estudante(String nome, LocalDate dataNasc, int serie) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.serie = serie;
        nroMatricula += 1;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", nroMatricula=" + nroMatricula +
                ", serie=" + serie +
                '}';
    }
}
