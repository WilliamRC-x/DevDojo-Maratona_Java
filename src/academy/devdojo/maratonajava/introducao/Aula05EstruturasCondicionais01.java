package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAturizadoComprarBebida = idade >= 18;

        if (isAturizadoComprarBebida == false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if (!isAturizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = true;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");

        }
    }
