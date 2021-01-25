package pe.com.bootcamp.encriptacionysesion.util



object Constants {

    //Web Service IP

    const val GENERAL_VALUE_NO_SELECTED = 1024
    const val GENERAL_EMPTY_TEXT = 0
    const val REST_TIMEOUT = 25.toLong()
    const val GENERAL_LOG_APP_TAG = "CED_LOG"
    const val PREFERENCES_NAME = "preferenceBCP"


    const val SESSION_APP: Long = 300000 // 5 MINUTES

    const val SESSION_EXPIRE_START: Long = 30000 // 31 SECOND
    const val SESSION_EXPIRE_END: Long = 31000 // 30 SECONDS

    /*Fonts*/


    /* REST String Responses */
    const val authentication = "Authorization"



    /*Regex*/
    const val REGEX_EMAIL = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}"
    const val REGEX_DOCUMENT = "^.{9}$"
    const val REGEX_PROCEDURE = "^.{11}$"
    const val REGEX_PASSWORD = "^([A-Z])(?=.*[0-9]).{7,16}\$"
    const val REGEX_CODE = "^.{6}\$"

    const val REGEX_MASKING_EMAIL = "(?<=.{2}).(?=.{2}[^@]*?@)"
    const val REGEX_MASKING_PHONE = "(?<=.{2}).(?=.{2})"


    /*Intent*/
    const val INTENT_TITLE = "intentTitle"
    const val INTENT_VALUE = "intentValue"
    const val INTENT_DIALOG_LOGOUT = "intentDialogLogout"

    /*Argument*/
    const val ARGUMENT_POST = "argumentPost"
    const val ARGUMENT_IMAGE = "argumentImaghe"
    const val ARGUMENT_USER_LOGIN = "userLogin"

}
