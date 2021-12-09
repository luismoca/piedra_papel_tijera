package com.example.pruebanavigation

import androidx.lifecycle.ViewModel

class InicioJuegoViewModel : ViewModel()  {
    var reinicioPuntajeH=""
    var reinicioPuntajeC=""

    init {
        reinicioPuntajeH=PuntajesReinicioH()
        reinicioPuntajeC=PuntajesReinicioC()
    }
     fun PuntajesReinicioH():String{
         return "0"
     }
    fun PuntajesReinicioC():String{
        return "0"
    }
    }
