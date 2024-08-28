package org.example;

public class ContaBancaria {
    private int conta;
    private String agencia;
    private String nomeCliente;
    private boolean saldoConta;

    public ContaBancaria(int conta, String agencia, String nomeCliente, Double saldoConta) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(boolean saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "conta=" + conta +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldoConta=" + saldoConta +
                '}';
    }
}
