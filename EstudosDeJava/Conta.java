package EstudosDeJava;

public class Conta {
    
    private double saldo;
    int agencia;
    int conta;

    void deposita(int valor){

        saldo += valor;
    }

    void saca(int valor){

        if(saldo >= valor){

            saldo -= saldo;
        }else{

            System.out.println("Você não tem dinheiro");
        }
    }

    public double mudaSaldo(double valor){
        
       return saldo = valor;
    }

    public double pegaSaldo(){

        return this.saldo;
    }

}
