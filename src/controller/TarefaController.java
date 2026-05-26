package controller;

import model.TarefaModel;
import java.util.ArrayList;


public class TarefaController {
    
    // Lista de tarefas
    
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    //Metodo Adicionar
    
    public void adicionar(String nome){
        TarefaModel tarefa = new TarefaModel(nome, true);
        lista.add(tarefa);
    }
    
    //Metodo Listar
    
    public ArrayList<TarefaModel> listar (){
        return lista;
    }

}
