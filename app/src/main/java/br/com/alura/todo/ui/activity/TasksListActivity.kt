package br.com.alura.todo.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.todo.R

class TasksListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks_list)
    }

    private fun add() {
        TODO("Adicionar tarefa")
    }

    private fun edit(){
        TODO("Editar terefa")
    }

    private fun remove(){
        TODO("Remover tarefa")
    }

    private fun configList() {
        TODO("Carregar tarefas e apresentá-las")
    }

}
