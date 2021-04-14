package pe.com.bootcamp.encriptacionysesion.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import pe.com.bootcamp.encriptacionysesion.adapter.EncriptadoAdapter
import pe.com.bootcamp.encriptacionysesion.data.Encriptacion
import pe.com.bootcamp.encriptacionysesion.databinding.ActivityEncriptarBinding
import pe.com.bootcamp.encriptacionysesion.util.crypto.EncryptionManager

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


        setup()

    }


    private fun setup() {

        binding.butAgregar.setOnClickListener {


            val value: String = binding.editTextNumber.text.toString()

            val encService = EncryptionManager(this)


            // ENCRIPTANDO INFORMACION

            val messageEncrypted = encService.encrypt(value)


            //DESENCRIPTANDO INFORMACION

            val desencryptedString = encService.decrypt(messageEncrypted!!)


            val encrypt = Encriptacion(messageEncrypted, desencryptedString)


            adapter.arrayDesencriptado.add(encrypt)

        }

    }
}