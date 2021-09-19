package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarwashActivity : AppCompatActivity() {

    lateinit var carwashAdapter: CarwashAdapter
    lateinit var btnIncluir: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carwash)


        setTitle("Lava-rápido")

        val rv = findViewById<RecyclerView>(R.id.rvCarwashs)
        carwashAdapter = CarwashAdapter(lista, this)
        btnIncluir = findViewById(R.id.btnIncluir)

        rv.adapter = carwashAdapter

        btnIncluir.setOnClickListener(){
            val intent = Intent(this, CarwashInsertActivity::class.java)
            startActivity(intent)
        }

        // Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)

    }

    // lista static
    companion object{
        val lista = mutableListOf<Carwash>()
    }

    override fun onResume() {
        super.onResume()
        carwashAdapter.notifyDataSetChanged()
    }

}