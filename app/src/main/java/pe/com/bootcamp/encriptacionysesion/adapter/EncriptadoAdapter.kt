package pe.com.bootcamp.encriptacionysesion.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.com.bootcamp.encriptacionysesion.data.Encriptacion
import pe.com.bootcamp.encriptacionysesion.databinding.ItemDesencriptadoBinding
import pe.com.bootcamp.encriptacionysesion.util.ItemClickListener


class EncriptadoAdapter() : RecyclerView.Adapter<EncriptadoAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener<Encriptacion>


    var arrayDesencriptado: MutableList<Encriptacion> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        //Este metodo hace la relacion con el layout del item
        val view =
            ItemDesencriptadoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Este metodo itera de acuerdo a lo que indicas en el metodo getItemCount

        val discount = arrayDesencriptado[position]
        holder.bind(discount)


    }

    override fun getItemCount(): Int {
        //Aqui indicas cuantas filas tendra tu RecyclerView
        return arrayDesencriptado.size
    }


    class ViewHolder(private val itemBinding: ItemDesencriptadoBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        lateinit var binding: ItemDesencriptadoBinding

        fun bind(encrypt: Encriptacion) {

            binding = itemBinding

            binding.tviEncriptado.text = encrypt.encriptado
            binding.tviDesencriptado.text = encrypt.desencriptado



        }
    }

}