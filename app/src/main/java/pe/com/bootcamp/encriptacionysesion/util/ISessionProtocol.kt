package pe.com.bootcamp.encriptacionysesion.util


interface ISessionProtocol {
    fun onSessionStart()
    fun onSessionWillExpire()
    fun onSessionLogout()
}