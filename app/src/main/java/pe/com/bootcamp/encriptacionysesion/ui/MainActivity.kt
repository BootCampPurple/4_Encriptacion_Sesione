package pe.com.bootcamp.encriptacionysesion.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.butIniciarSesion.setOnClickListener {
            BCPApplication.startSession()
        }






        val encService = EncryptionManager(this)
        encService.createMasterKey()

        //To get public key.
        val myPublicKey = encService.getMyPublicKey()


        //Obtener llave publica para enviarlo a un servidor
        val myPublicKeyString =
                String(android.util.Base64.encode(myPublicKey!!.encoded, android.util.Base64.NO_WRAP))


        //To get PublicKey from string that shared by others
        //val othersPublicKey = encService.getOtherPublicKey(myPublicKeyString)

        //Encrypt Message (Using other's public key)
        val message: String = "Hi, Ross"
        //val otherEnc = encService.encryptOthers(message, othersPublicKey!!)
        val otherEnc = encService.encryptOthers(message, myPublicKey)


        //Decrypt Message (Which encrypted using my public key)
        val encryptedString: String
        val decryptedString = encService.decrypt(otherEnc!!)


        val lol = ""
    }
}