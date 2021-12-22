package src.JavaII.ExercicioEstudantes;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Turma {
    private int serie;
    private int codigo;
    private Disciplina[] disciplinas;
    private Estudante[] estudantes;
    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Estudante[] getEstudantes() {
        return estudantes;
    }
    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
    public Turma(int serie, Disciplina[] disciplinas, Estudante[] estudantes) {
        this.serie = serie;
        codigo = ThreadLocalRandom.current().nextInt(1, 200 + 1);
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }
    @Override
    public String toString() {
        return "Turma {" +
                "serie=" + serie +
                ", codigo=" + codigo +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                ", estudantes=" + Arrays.toString(estudantes) +
                '}';
    }
}