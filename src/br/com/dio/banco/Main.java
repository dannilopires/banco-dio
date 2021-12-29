package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jonas");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(70);


        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(10,poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}
