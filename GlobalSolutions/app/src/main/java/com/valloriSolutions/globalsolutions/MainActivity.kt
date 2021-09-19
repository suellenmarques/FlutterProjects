package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var schedulingAdapter: SchedulingAdapter
    //lateinit var btnIncluir: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.menu.findItem(R.id.nav_scheduling).setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.nav_scheduling -> {
                    drawerLayout.closeDrawers()
                    val intent = Intent(this, SchedulingActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        navView.menu.findItem(R.id.nav_carwash).setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.nav_carwash -> {
                    drawerLayout.closeDrawers()
                    val intent = Intent(this, CarwashActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        navView.menu.findItem(R.id.nav_car).setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.nav_car -> {
                    drawerLayout.closeDrawers()
                    val intent = Intent(this, CarActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        setTitle(R.string.menu_scheduling)

        //Inicio Scheduling
        /*val rv = findViewById<RecyclerView>(R.id.rvScheduling)

        schedulingAdapter = SchedulingAdapter(lista)
        rv.adapter = SchedulingAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)


         */

        //val lista = mutableListOf<Scheduling>(
        //   Scheduling(agendamento="Troca de óleo", local = "Mercado Car", data = "10/06/2021"),
        //   Scheduling(agendamento = "Revisão", local = "Concessionária", data = "25/06/2021")
        //)

        //Fim Scheduling




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
    // lista static
    companion object{
        val lista = mutableListOf<Scheduling>()
    }

    override fun onResume() {
        super.onResume()
       // schedulingAdapter.notifyDataSetChanged()
    }


}