package src.JavaII.ExercicioPassword;


public class main {
    public static void main(String[] args) {
        //Mínimo de oito caracteres, pelo menos uma letra maiúscula, uma letra minúscula e um número
        PasswordForte passwordForte = new PasswordForte("^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$");
        passwordForte.setValue("senhaAA1234**");

        //Mínimo de oito caracteres, pelo menos uma letra, um número e um caractere especial
        PasswordMedia passwordMedia = new PasswordMedia("^(?=.*[a-z])(?=.*d)(?=.*[@$!%*#?&])[a-zd@$!%*#?&]{8,}$");
        passwordMedia.setValue("teste");

        //Mínimo de oito caracteres, pelo menos uma letra e um número
        PasswordFraca passwordFraca = new PasswordFraca("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
        passwordFraca.setValue("teste");
    }
}
