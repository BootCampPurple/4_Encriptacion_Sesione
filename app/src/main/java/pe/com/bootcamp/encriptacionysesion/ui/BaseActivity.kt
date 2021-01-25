package pe.com.bootcamp.encriptacionysesion.ui


import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog
import pe.com.bootcamp.encriptacionysesion.R
import pe.com.bootcamp.encriptacionysesion.application.BCPApplication
import pe.com.bootcamp.encriptacionysesion.util.ISessionProtocol


open class BaseActivity : AppCompatActivity(), ISessionProtocol {

    private lateinit var materialDialog: MaterialDialog

    override fun onResume() {
        super.onResume()
        BCPApplication.registerSessionListener(this)

    }

//region interface session

    override fun onSessionStart() {

        //BCPApplication.resetSession()
    }

    override fun onSessionWillExpire() {

        materialDialog = MaterialDialog(this).show {
            title(R.string.general_oops)
            message(text = "Por seguridad. Tu sesión esta por expirar. ¿Desea continuar?")
            cancelable(false)

            positiveButton(R.string.general_yes) { dialog ->
                BCPApplication.startSession()
                dialog.dismiss()


            }

            negativeButton(R.string.general_no) { dialog ->
                dialog.dismiss()
                BCPApplication.finishSession()

                finish()
            }


        }
    }

    override fun onSessionLogout() {

        materialDialog.dismiss()
    }
}