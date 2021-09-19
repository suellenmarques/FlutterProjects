package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CarInsertActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener  {
    lateinit var edtAno: EditText
    lateinit var edtPlaca: EditText
    lateinit var edtModelo: EditText
    lateinit var edtProprietario: EditText
    lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_insert_activity)

        edtAno = findViewById(R.id.edtAno)
        edtPlaca = findViewById(R.id.edtPlaca)
        edtModelo = findViewById(R.id.edtModelo)
        edtProprietario = findViewById(R.id.edtProprietario)
        btnSalvar = findViewById(R.id.btnSalvar)




        btnSalvar.setOnClickListener(){
            val car = Car(edtAno.text.toString(), edtModelo.text.toString(), edtPlaca.text.toString(), edtProprietario.text.toString())
            CarActivity.lista.add(car)
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