package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*int idade = 18;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }*/
        // Forma mais limpa e correta.
        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
