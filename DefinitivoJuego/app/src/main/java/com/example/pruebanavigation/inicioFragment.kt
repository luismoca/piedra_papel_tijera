package com.example.pruebanavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.lifecycle.ViewModelProvider
import com.example.pruebanavigation.databinding.FragmentInicioBinding




class inicioFragment : Fragment() {
    private var _binding:FragmentInicioBinding? = null
    private val binding get() = _binding!!
    lateinit var viewModel: InicioJuegoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel = ViewModelProvider(this).get(InicioJuegoViewModel::class.java)

        binding.btnArranquemos.setOnClickListener {
            val action=inicioFragmentDirections
                .actionInicioFragmentToLecturaDatosFragment(viewModel.reinicioPuntajeH,viewModel.reinicioPuntajeC)
            view.findNavController().navigate(action)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}