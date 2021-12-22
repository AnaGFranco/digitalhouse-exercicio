package ExerciciosIntroducaoJava.JavaII.ExercicioPassword;

public class Password {
    private String pwd;
    private String regex;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setValue(String pwd) {
        if (pwd.matches(regex)){
            this.pwd = pwd;
        }else{
            throw new SecurityException("Sua senha não atende os requisitos");
        }
    }

}
