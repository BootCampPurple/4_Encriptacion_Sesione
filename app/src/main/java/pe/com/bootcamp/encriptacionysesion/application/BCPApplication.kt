package pe.com.bootcamp.encriptacionysesion.application

import android.app.Application
import android.content.res.Resources
import android.os.CountDownTimer
import android.util.Log
import pe.com.bootcamp.encriptacionysesion.util.AppPreferences
import pe.com.bootcamp.encriptacionysesion.util.Constants
import pe.com.bootcamp.encriptacionysesion.util.ISessionProtocol


class BCPApplication : Application() {


    companion object {

        lateinit var sessionListener: ISessionProtocol

        lateinit var resourses: Resources
            private set


        private val countDownTimer = object : CountDownTimer(Constants.SESSION_APP, 1000) {
            override fun onTick(millisUntilFinished: Long) {

                when (millisUntilFinished) {
                    in Constants.SESSION_EXPIRE_START..Constants.SESSION_EXPIRE_END -> sessionListener.onSessionWillExpire()

                }

                Log.d("RICCMP", "millisUntilFinished $millisUntilFinished")
            }

            override fun onFinish() {
                sessionListener.onSessionLogout()

            }
        }


        fun startSession() {

            countDownTimer.start()

        }

        fun finishSession() {

            countDownTimer.cancel()

        }

        fun registerSessionListener(sessionListener: ISessionProtocol) {
            this.sessionListener = sessionListener
        }

    }

    override fun onCreate() {
        super.onCreate()

        resourses = resources

        //Instance Class to manage Shared Preference
        AppPreferences.init(this)

    }


}
