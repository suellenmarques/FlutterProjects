package com.valloriSolutions.globalsolutions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CarAdapter (var listaCar:
                         MutableList<Car>, var context: Context):RecyclerView.Adapter<CarAdapter.ItemViewHolder>() {
// Responsável por encontrar os componentes dentro do layout (scheduling_car) e indicar que o
    // layout será replicado na Recycler View
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        //val imageView2: ImageView = view.findViewById(R.id.imageView2)
        val txtModelo: TextView = view.findViewById(R.id.txtModelo)
        val txtAno: TextView = view.findViewById(R.id.txtAno)
        val txtPlaca: TextView = view.findViewById(R.id.txtPlaca)
        val txtProprietario: TextView = view.findViewById(R.id.txtProprietario)

    }
// Responsável por inflar (fazer aparecer) o layout por exemplo na
    //activity ou fragment ou dialog (tudo que extends View Group)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return ItemViewHolder(view)
    }
// Vincula os componentes do layout (scheduling_car) a um
    //dado/propriedade/atributo da lista
    override fun onBindViewHolder(holder: ItemViewHolder, position:
    Int) {
      /*  listaScheduling[position].foto?.let{
            holder.imageView2.setImageDrawable(it)
        }*/
        holder.txtModelo.text = listaCar[position].modelo
        holder.txtPlaca.text = listaCar[position].placa
        holder.txtAno.text = listaCar[position].ano
        holder.txtProprietario.text = listaCar[position].proprietario
    // Implementando o "click" do CardView para retornar um Toast como mensagem
    holder.itemView.setOnClickListener(){
        var texto = listaCar[position].modelo

        Toast.makeText(context, texto, Toast.LENGTH_SHORT).show()
    }
    }
    // Indica quantos registros/itens a lista possui
    override fun getItemCount(): Int {
        return listaCar.size
    }
}