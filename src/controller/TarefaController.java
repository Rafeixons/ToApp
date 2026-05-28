package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {

    TarefaModel tarefa = new TarefaModel();

    // Lista de tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();

    //Metodo Adicionar
    public void adicionar(String nome) {
        TarefaModel t = new TarefaModel();
        t.setNome(nome);
        lista.add(t);
    }

    //Metodo Listar
    public ArrayList<TarefaModel> listar() {
        return lista;
    }

    public int tamanho() {
        return lista.size();
    }

    public void concluir(boolean a) {
        if (!lista.isEmpty()) {
            lista.get(lista.size() - 1).setConcluida(a);
        }
    }

    public void excluir(String nome) {
        for (TarefaModel t : lista) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                lista.remove(t);
            }

        }

    }
}
