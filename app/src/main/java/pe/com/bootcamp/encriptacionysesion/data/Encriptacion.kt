package pe.com.bootcamp.encriptacionysesion.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Encriptacion(
    val encriptado: String,
    val desencriptado: String

) : Parcelable



