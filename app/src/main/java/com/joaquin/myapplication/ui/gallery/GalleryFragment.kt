package com.joaquin.myapplication.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.joaquin.myapplication.R
import com.joaquin.myapplication.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)

        val seguros = arrayOf(
            "GlobeGuard Insurance",
            "Real Safe Journey COverage",
            "TravelShield Protection",
            "VoyageSecure",
            "WanderSure Travel Insurance"
        )

        val listView: ListView = view.findViewById(R.id.lvSeguros)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, seguros)
        listView.adapter = adapter

        return view
    }
}