package EstudosDeJava;

public class Banco {
    
    public static void main(String[] args) {
        
        Conta marcus = new Conta();

        marcus.mudaSaldo(100);
        marcus.deposita(300);
        System.out.println(marcus.pegaSaldo());

    }

}
