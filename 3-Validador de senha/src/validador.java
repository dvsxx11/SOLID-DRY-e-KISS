import java.util.regex.Pattern;
public class validador {
public static boolean validar(String senha){

    if( senha.length() < 8){
    System.out.println("A senha deve ter pelo menos 8 caracteres.");
    return false;
}

    if(!Pattern.compile("\\d").matcher(senha).find()){
    System.out.println("A senha deve conter pelo menos 1 número.");
    return false;
}

    if (!Pattern.compile("[A-Z]").matcher(senha).find()){
    System.out.println("A senha deve conter pelo menos 1 letra maiúscula.");
    return false;
    }

    return true;
}

    public static void main(String[] args) {
String senha = "Davi";

    if(validar(senha)){
        System.out.println("Senha correta.");}

    else{
        System.out.println("Senha incorreta.");
        }
    }
}