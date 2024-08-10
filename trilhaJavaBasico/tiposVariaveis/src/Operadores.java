public class Operadores {
    public static void main(String[] args) {
    /*
    * se identificar uma string "" dentro de uma passagem de valores irá concatenar
    * exceto se tiver uma priorização, ex.: "1"+(1+1+1);
    */

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
}
