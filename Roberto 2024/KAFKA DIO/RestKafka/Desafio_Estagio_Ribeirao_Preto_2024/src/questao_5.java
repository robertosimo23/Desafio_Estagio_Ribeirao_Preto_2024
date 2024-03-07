public class questao_5 {
    public static void main(String[] args) {
        String original = "Roberto";
        char [] caracteres = original.toCharArray();
        String invertida = " ";

        for (int i = caracteres.length - 1; i >=0 ; i--) {
            invertida += caracteres[i];
        }
        System.out.println("String original: "+ " " + original);
        System.out.println("String invertida: "+ " " + invertida);
    }
}
//Projeto Feito por Roberto Simões