public class Ex11Aula2 {
    public static void main(String[]args){
        int idade = 11;
        if (idade < 12){
            System.out.print("Entrada permitida apenas com responsável");
        }
        else if (idade >=12 && idade <=17){
            System.out.print("Entrada permitida na área juvenil");     
        } else {
            System.out.println("Entrada liberada para todas as áreas");
        }
    }
}
