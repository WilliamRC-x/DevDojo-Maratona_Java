package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando o Switch e dados os valores de 1 à 7, imprima se é dia útil ou final de semana.
        /*byte dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        if (dia >= 2 && dia <= 6) {
            System.out.println("É dia útil");
        }else if (dia == 7 || dia == 8) {
            System.out.println("É final de semana");
        }else{
            System.out.println("Opção Inválida!");
        }*/

        // Outra opção

        byte dia2 = 5;
        switch (dia2) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
        }
    }
}
