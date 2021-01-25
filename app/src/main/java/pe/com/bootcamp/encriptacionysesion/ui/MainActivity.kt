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






    }
}