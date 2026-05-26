
package model;


public class TarefaModel {
    
    // Atributos
    
    private String nome;
    private boolean concluida;

    
    // Construtores
    
    public TarefaModel(String nome, boolean concluida) {
        this.nome = nome;
        this.concluida = concluida = false;
    }

    public TarefaModel() {
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa: " + " \n nome = " + nome + "\nconcluida = " + concluida;
    }
}
