package com.example.pruebanavigation

import androidx.lifecycle.ViewModel
import kotlin.random.Random
import com.example.pruebanavigation.databinding.FragmentInicioBinding

class LogicaViewModel : ViewModel()  {
    var condicion: String =""
    var puntajeJugador: Int = 0
    var puntajeCompu: Int = 0
    var compuSele = seleccionCompu()

    fun seleccionCompu(): String {
        var opciones = arrayOf("piedra", "papel", "tijera")
        var num = Random.nextInt(0, 3)
        return opciones[num]
    }
fun condiciones(mensaje:String)

{
    var sc: String = compuSele;
    var sj: String? = mensaje;
    when (sc) {
        "piedra" -> {
            if (sj == "tijera") {
                condicion = "Gane"
                puntajeCompu++
            } else if (sj == "piedra") {
                condicion = "empate"
            } else {
                condicion = "Gano usted"
                puntajeJugador++
            }
        }
        "tijera" -> {
            if (sj == "tijera") {
                condicion = "empate"

            } else if (sj == "piedra") {
                condicion = "Gano usted"
                puntajeJugador++
            } else {
                condicion = "Gane"
                puntajeCompu++

            }


        }

        "papel" -> {
            if (sj == "tijera") {
                condicion = "Gano usted"
                puntajeJugador++

            } else if (sj == "piedra") {
                condicion = "Gane"
                puntajeCompu++
            } else {
                condicion = "empate"
            }
        }
        //else -> println("lo vas a pensar o no")
    }





}
    fun puntajehumano(pFh:String):String{
        puntajeJugador+=pFh.toInt()
        return puntajeJugador.toString()


    }
    fun puntajeMaquina(pFc:String):String{
        puntajeCompu+=pFc.toInt()
        return puntajeCompu.toString()



    }
    fun quienGano():String{

        return condicion



    }
    fun queOpcionCompu():String{

        return compuSele



    }

}
