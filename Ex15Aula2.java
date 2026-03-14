public class Ex15Aula2 {
    public static void main(String[]args){
        int frequencia = 80;
        int nota = 35;
        if (frequencia < 75) {
            System.out.println("Reprovado por falta");
            }  else if(nota >=60){
                 System.out.println("Aprovado");
            } else if(nota >=40){
                System.out.println("Recuperação");
            } else if(nota <40 ) {
                System.out.println("Reprovado por nota");
            }
    }

}
