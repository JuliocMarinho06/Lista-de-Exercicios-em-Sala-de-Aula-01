public class Ex12Aula2 {
    public static void main(String[] args) {
        String usuario = "admin";
        String senha = "1234";
        String perfil = "gerente";
        if (usuario.equals("admin") && senha.equals("1234")) {
            if (perfil.equals("gerente")) {
                System.out.println("Acesso total ao sistema");
            } else if (perfil.equals("funcionario")) {
                System.out.println("Acesso limitado");
            } else {
                System.out.println("Perfil não reconhecido");
            }
        } else {
            System.out.println("Dados invalidos, encerrando programa...");
            System.exit(1);
        }
    }
}