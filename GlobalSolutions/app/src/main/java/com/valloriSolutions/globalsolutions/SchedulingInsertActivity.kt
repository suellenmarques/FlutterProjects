package com.valloriSolutions.globalsolutions

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SchedulingInsertActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener  {
    lateinit var edtAgendamento: EditText
    lateinit var edtData: EditText
    lateinit var edtLocal: EditText
    lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scheduling_insert_activity)

        edtAgendamento = findViewById(R.id.edtAgendamento)
        edtData = findViewById(R.id.edtData)
        edtLocal = findViewById(R.id.edtLocal)
        btnSalvar = findViewById(R.id.btnSalvar)




        btnSalvar.setOnClickListener(){
            val schedule = Scheduling(null, edtAgendamento.text.toString(), edtLocal.text.toString(), edtData.text.toString())
            SchedulingActivity.lista.add(schedule)
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