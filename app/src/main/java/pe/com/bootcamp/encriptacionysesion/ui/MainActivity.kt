package pe.com.bootcamp.encriptacionysesion.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import pe.com.bootcamp.encriptacionysesion.R
import pe.com.bootcamp.encriptacionysesion.application.BCPApplication
import pe.com.bootcamp.encriptacionysesion.databinding.ActivityMainBinding
import pe.com.bootcamp.encriptacionysesion.util.crypto.EncryptionManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.butEncriptar.setOnClickListener {
            val intent = Intent(this, EncriptarActivity::class.java)
            startActivity(intent)
        }



        //Ejemplo
        val encService = EncryptionManager(this)
        encService.createMasterKey()


        //Obtener Llave publica
        val myPublicKey = encService.getMyPublicKey()

        //Obtener la llave publica en formato String

        val myPublicKeyString = String(Base64.encode(myPublicKey!!.encoded, Base64.NO_WRAP))


        Log.d("CLASE_ENCRIPTACION", myPublicKeyString)


        // ENCRIPTANDO INFORMACION
        val message = "Hola Mundo 2021"

        //val messageEncrypted = encService.encryptOthers(message, myPublicKey)
        val messageEncrypted = encService.encrypt(message)
        Log.d("CLASE_ENCRIPTACION", "Mensaje encriptado: ${messageEncrypted}")


        //DESENCRIPTANDO INFORMACION

        val desencryptedString = encService.decrypt(messageEncrypted!!)

        Log.d("CLASE_ENCRIPTACION", "Mensaje desencriptado: ${desencryptedString}")


    }
}