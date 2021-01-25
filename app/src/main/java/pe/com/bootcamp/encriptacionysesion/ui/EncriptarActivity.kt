package pe.com.bootcamp.encriptacionysesion.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.com.bootcamp.encriptacionysesion.adapter.EncriptadoAdapter
import pe.com.bootcamp.encriptacionysesion.databinding.ActivityEncriptarBinding

class EncriptarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEncriptarBinding
    private lateinit var adapter: EncriptadoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEncriptarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adapter = EncriptadoAdapter()


        binding.rviEncriptado.layoutManager = LinearLayoutManager(this)
        binding.rviEncriptado.adapter = adapter

        //adapter.arrayDesencriptado = it

    }
}