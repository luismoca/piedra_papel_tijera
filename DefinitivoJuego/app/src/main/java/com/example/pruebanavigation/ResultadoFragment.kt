package com.example.pruebanavigation

import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.pruebanavigation.databinding.FragmentLecturaDatosBinding


class ResultadoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_resultado, container, false)
        var puntajeH = ResultadoFragmentArgs
            .fromBundle(requireArguments())
            .puntajeJugador

        var puntajeC = ResultadoFragmentArgs
            .fromBundle(requireArguments())
            .puntajeComp
        var mostrarPJ = view.findViewById<TextView>(R.id.txtPuntajesFinales)
        mostrarPJ.text = " Tu puntaje $puntajeH  vs puntaje Robot $puntajeC"
        var opcionObtenida = ResultadoFragmentArgs
            .fromBundle(requireArguments())
            .opcionHumano
        var condicionJuego = ResultadoFragmentArgs
            .fromBundle(requireArguments())
            .condicion
        var SeleComp = ResultadoFragmentArgs
            .fromBundle(requireArguments())
            .seleComp
        var elResultado = view.findViewById<TextView>(R.id.txtResultado)
        elResultado.text = "TU elegiste ${opcionObtenida}"
        var eleccionCompu = view.findViewById<TextView>(R.id.txtOpcionCompu)
        eleccionCompu.text = "El Robot $SeleComp"


        var condicionVamos = view.findViewById<TextView>(R.id.txtCondicion)
        condicionVamos.text = "$condicionJuego"


        var botonContinuar = view.findViewById<Button>(R.id.btnContinuar)

        botonContinuar.setOnClickListener {
            val action = ResultadoFragmentDirections.actionResultadoFragmentToLecturaDatosFragment(puntajeH,puntajeC)
            view.findNavController().navigate(action)

        }
        var botonTerminar = view.findViewById<Button>(R.id.btnTerminar)

        botonTerminar.setOnClickListener {
            val action = ResultadoFragmentDirections.actionResultadoFragmentToInicioFragment()
            view.findNavController().navigate(action)

        }

        return view
    }

}








