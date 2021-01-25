package pe.com.bootcamp.encriptacionysesion.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import pe.com.bootcamp.encriptacionysesion.adapter.EncriptadoAdapter
import pe.com.bootcamp.encriptacionysesion.application.BCPApplication
import pe.com.bootcamp.encriptacionysesion.data.Encriptacion
import pe.com.bootcamp.encriptacionysesion.databinding.ActivityEncriptarBinding
import pe.com.bootcamp.encriptacionysesion.util.crypto.EncryptionManager

class EncriptarActivity : BaseActivity() {

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

    fun setup(){
        binding.butAgregar.setOnClickListener {



            val valor = binding.eteTexto.text.toString()


            val encService = EncryptionManager(this)


            //Obtener la llave publica
            val myPublicKey = encService.getMyPublicKey()

            //Obtener llave publica en formato String
            val myPublicKeyString = String(Base64.encode(myPublicKey!!.encoded, Base64.NO_WRAP))


            //Encriptando informacion


            val messageEncrypted = encService.encryptOthers(valor, myPublicKey)

            //Desencriptando informacion

            val desencryptedString = encService.decrypt(messageEncrypted!!)

            val encrypt = Encriptacion(messageEncrypted, desencryptedString)


            adapter.arrayDesencriptado.add(encrypt)





        }
    }

}