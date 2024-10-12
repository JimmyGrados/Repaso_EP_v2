package com.joaquin.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.joaquin.myapplication.R
import com.joaquin.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular)
        val etVuelo: EditText = view.findViewById(R.id.etVuelo)
        val etAlojamiento: EditText = view.findViewById(R.id.etAlojamiento)
        val etCantNoches: EditText = view.findViewById(R.id.etCantNoches)
        val etComida: EditText = view.findViewById(R.id.etComida)
        val ckTyC: CheckBox = view.findViewById(R.id.ckTyC)
        val txtResult: TextView = view.findViewById(R.id.tvResult)


        btnCalcular.setOnClickListener {
            val agree = ckTyC.isChecked

            val ctVuelo = etVuelo.text.toString().toDouble()
            val ctAlojamiento = etAlojamiento.text.toString().toDouble()
            val cantNoche = etCantNoches.text.toString().toDouble()
            val ctComida = etComida.text.toString().toDouble()

            val resultado = ctVuelo + (ctAlojamiento * cantNoche) + (ctComida * cantNoche)

            txtResult.text = "$resultado USD"
        }

        return view
    }
}