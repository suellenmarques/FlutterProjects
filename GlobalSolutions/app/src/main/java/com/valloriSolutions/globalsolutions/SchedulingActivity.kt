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

class SchedulingActivity : AppCompatActivity() {

    lateinit var schedulingAdapter: SchedulingAdapter
    lateinit var btnIncluir: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheduling)


        setTitle(R.string.scheduling_title)

        val rv = findViewById<RecyclerView>(R.id.rvSchedules)
        schedulingAdapter = SchedulingAdapter(lista, this)
        btnIncluir = findViewById(R.id.btnIncluir)

        rv.adapter = schedulingAdapter

        btnIncluir.setOnClickListener(){
            val intent = Intent(this, SchedulingInsertActivity::class.java)
            startActivity(intent)
        }

        // Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)

    }

    // lista static
    companion object{
        val lista = mutableListOf<Scheduling>()
    }

    override fun onResume() {
        super.onResume()
        schedulingAdapter.notifyDataSetChanged()
    }

}