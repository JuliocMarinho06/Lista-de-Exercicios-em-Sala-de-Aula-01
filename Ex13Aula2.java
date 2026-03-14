public class Ex13Aula2 {
    public static void main(String[]args) {
        double valorCompra = 190.00;
        Boolean clienteVip = false;
        String textoVip20 = "Por ser um cliente Vip e a compra ser maior que R$200.00,você tem 20% de desconto, assim o valor final é:";
        if (clienteVip) {
            if (valorCompra >= 200){
                double valorFinal = valorCompra * 0.20;
                System.out.println(textoVip20);
                System.out.println(valorCompra - valorFinal);
            } else {
                double valorFinal = valorCompra * 0.10;
                System.out.println("Por ser um cliente Vip e a compra ser menor que R$200.00,você tem 10% de desconto, assim o valor final é:");
                System.out.println(valorCompra - valorFinal);
            }
        } if (!clienteVip){
            if (valorCompra >= 200){
                double valorFinal = valorCompra * 0.10;
                System.out.println("Por não ser um cliente Vip e a compra ser maior que R$200.00,você tem 10% de desconto, assim o valor final é:");
                System.out.println(valorCompra - valorFinal);
            } else {
                double valorFinal = valorCompra;
                System.out.println("Por não ser um cliente Vip e a compra ser menor que R$200.00,você recebe nenhum desconto, assim o valor final é:");
                System.out.println(valorFinal);
            }   
        } 
    }
}

