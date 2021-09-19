package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarActivity : AppCompatActivity() {

    lateinit var carAdapter: CarAdapter
    lateinit var btnIncluir: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)


        setTitle(R.string.car_title)

        val rv = findViewById<RecyclerView>(R.id.rvCars)
        carAdapter = CarAdapter(lista, this)
        btnIncluir = findViewById(R.id.btnIncluir)

        rv.adapter = carAdapter

        btnIncluir.setOnClickListener(){
            val intent = Intent(this, CarInsertActivity::class.java)
            startActivity(intent)
        }

        // Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)

    }

    // lista static
    companion object{
        val lista = mutableListOf<Car>()
    }

    override fun onResume() {
        super.onResume()
        carAdapter.notifyDataSetChanged()
    }

}