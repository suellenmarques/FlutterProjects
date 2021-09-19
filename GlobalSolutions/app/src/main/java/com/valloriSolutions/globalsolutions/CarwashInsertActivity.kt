package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CarwashInsertActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener  {
    lateinit var edtNome: EditText
    lateinit var edtEndereco: EditText
    lateinit var edtValor: EditText
    lateinit var edtHorario: EditText
    lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carwash_insert_activity)

        edtNome = findViewById(R.id.edtNome)
        edtEndereco = findViewById(R.id.edtEndereco)
        edtValor = findViewById(R.id.edtValor)
        edtHorario = findViewById(R.id.edtHorario)
        btnSalvar = findViewById(R.id.btnSalvar)




        btnSalvar.setOnClickListener(){
            val carwash = Carwash(edtNome.text.toString(), edtEndereco.text.toString(), edtValor.text.toString(), edtHorario.text.toString())
            CarwashActivity.lista.add(carwash)
            finish()
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }


    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //super.onActivityResult(requestCode, resultCode, data)



    }
}