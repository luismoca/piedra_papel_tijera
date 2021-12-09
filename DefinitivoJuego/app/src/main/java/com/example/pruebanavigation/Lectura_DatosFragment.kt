package com.example.pruebanavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import kotlin.random.Random
import androidx.lifecycle.ViewModelProvider
import com.example.pruebanavigation.databinding.FragmentLecturaDatosBinding



class Lectura_DatosFragment : Fragment() {
    private var _binding: FragmentLecturaDatosBinding? = null
    private val binding get() = _binding!!
    lateinit var viewModel: LogicaViewModel








    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLecturaDatosBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel = ViewModelProvider(this).get(LogicaViewModel::class.java)

        binding.btnsiguiente.setOnClickListener {
            val mensaje = binding.txtOpcion.text.toString()
            viewModel.condiciones(mensaje)




            var pFh=Lectura_DatosFragmentArgs
                .fromBundle( requireArguments())
                .puntajeFinalHumano
            var pFc=Lectura_DatosFragmentArgs
                .fromBundle(requireArguments())
                .puntajeFinalCompu



            val action = Lectura_DatosFragmentDirections.actionLecturaDatosFragmentToResultadoFragment(mensaje,
                    viewModel.quienGano(),viewModel.puntajehumano(pFh),viewModel.puntajeMaquina(pFc),viewModel.queOpcionCompu())
                view.findNavController().navigate(action)


        }
        return view

    }
}


