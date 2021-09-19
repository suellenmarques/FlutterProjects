package com.valloriSolutions.globalsolutions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CarwashAdapter (var listaCarwash:
                         MutableList<Carwash>, var context: Context):RecyclerView.Adapter<CarwashAdapter.ItemViewHolder>() {
// Responsável por encontrar os componentes dentro do layout (scheduling_car) e indicar que o
    // layout será replicado na Recycler View
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        //val imageView2: ImageView = view.findViewById(R.id.imageView2)
        val txtNome: TextView = view.findViewById(R.id.txtNome)
        val txtEndereco: TextView = view.findViewById(R.id.txtEndereco)
        val txtValor: TextView = view.findViewById(R.id.txtValor)
        val txtHorario: TextView = view.findViewById(R.id.txtHorario)

    }
// Responsável por inflar (fazer aparecer) o layout por exemplo na
    //activity ou fragment ou dialog (tudo que extends View Group)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carwash_item, parent, false)
        return ItemViewHolder(view)
    }
// Vincula os componentes do layout (scheduling_car) a um
    //dado/propriedade/atributo da lista
    override fun onBindViewHolder(holder: ItemViewHolder, position:
    Int) {
      /*  listaScheduling[position].foto?.let{
            holder.imageView2.setImageDrawable(it)
        }*/
        holder.txtNome.text = listaCarwash[position].nome
        holder.txtEndereco.text = listaCarwash[position].endereco
        holder.txtValor.text = listaCarwash[position].valor.toString()
        holder.txtHorario.text = listaCarwash[position].horario
    // Implementando o "click" do CardView para retornar um Toast como mensagem
    holder.itemView.setOnClickListener(){
        var texto = listaCarwash[position].nome

        Toast.makeText(context, texto, Toast.LENGTH_SHORT).show()
    }
    }
    // Indica quantos registros/itens a lista possui
    override fun getItemCount(): Int {
        return listaCarwash.size
    }
}