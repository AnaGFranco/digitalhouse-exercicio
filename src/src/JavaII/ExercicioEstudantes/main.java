package src.JavaII.ExercicioEstudantes;


import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matematica", 80);
        Disciplina d2 = new Disciplina("Português", 70);
        Disciplina d3 = new Disciplina("História", 60);
        Disciplina disciplinas[] = {d1, d2, d3};
        Estudante e1 = new Estudante("Pedro", LocalDate.now(), 1);
        Estudante e2 = new Estudante("Renan", LocalDate.now(), 1);
        Estudante e3 = new Estudante("Emanuelle", LocalDate.now(), 2);
        Estudante e4 = new Estudante("Willy", LocalDate.now(), 2);
        Estudante e5 = new Estudante("Douglas", LocalDate.now(), 3);
        Estudante e6 = new Estudante("Ana", LocalDate.now(), 3);
        Estudante estudantes[] = {e1, e2, e3, e4, e5, e6};
        Turma t = new Turma(1, disciplinas, estudantes);
        System.out.println(t.toString());
    }
}
