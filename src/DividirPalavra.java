import java.util.Scanner;

public class DividirPalavra {
    private String frase;
    // Ex: banana -> criptografia -> edqdqd
    // 'a' -> um único caractere
    // "a" -> umaa sequência de caracteres(String)
    private final char[] alfabeto = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };

    public DividirPalavra(String frase) {
        this.frase = frase;
    }

    public void separadorDeLetras() {
        char[] palavras = frase.toCharArray();
        for (char palavra : palavras) {
            System.out.println(palavra);
        }
    }

    public void separadorDeAlfabeto() {
        for (char palavra : alfabeto) {
            System.out.println(palavra);
        }
    }

    public static void decifradorCesar(String frase, int key) {
        if (key > 0) {
            String fraseMinusculo = frase.toLowerCase();
            char[] palavras = fraseMinusculo.toCharArray();
            for (char palavra : palavras) {
                if (palavra == (' ')) {
                    System.out.println(" ");
                } else {
                int pegarCaracter = palavra - 'a';
                int somarCaracter = pegarCaracter + key;
                char resultado = (char) (somarCaracter % 26 + 'a');
                System.out.println(resultado);
                }
            }
        }
    }
}
