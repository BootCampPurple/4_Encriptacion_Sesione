package pe.com.bootcamp.encriptacionysesion.util

import android.content.Context
import android.content.SharedPreferences



//Reference https://github.com/lomza/sharedpreferences-in-kotlin
object AppPreferences {
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    // list of app specific preferences
    private val PAIR_PARAMETRY_CE = Pair("PARAMETRY_CE", "")

    private val PAIR_USER_STORED = Pair("USER_STORED", "")



    fun init(context: Context) {
        preferences = context.getSharedPreferences(Constants.PREFERENCES_NAME, MODE)
    }

    /**
     * SharedPreferences extension function, so we won't need to call edit() and apply()
     * ourselves on every SharedPreferences operation.
     */
    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }





    fun clearSharePreferences() {
        preferences
            .edit()
            .clear()
            .apply()
    }


    //region login
    private var parametryCE: String?
        get() = preferences.getString(PAIR_PARAMETRY_CE.first, PAIR_PARAMETRY_CE.second)
        set(value) = preferences.edit {
            it.putString(PAIR_PARAMETRY_CE.first, value)
        }


    var userStored: String?
        get() = preferences.getString(PAIR_USER_STORED.first, PAIR_USER_STORED.second)
        set(value) = preferences.edit {
            it.putString(PAIR_USER_STORED.first, value)
        }


    //endregion


}