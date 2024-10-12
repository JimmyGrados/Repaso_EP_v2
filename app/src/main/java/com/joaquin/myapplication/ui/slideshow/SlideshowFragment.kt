package com.joaquin.myapplication.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.joaquin.myapplication.R
import com.joaquin.myapplication.ui.adapter.HotelAdapter
import com.joaquin.myapplication.ui.model.HotelModel

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_slideshow, container, false)

        val rvHotel: RecyclerView = view.findViewById(R.id.rvHotel)
        rvHotel.layoutManager = LinearLayoutManager(requireContext())
        rvHotel.adapter = HotelAdapter(getHotels())
        return view

    }

    private fun getHotels(): List<HotelModel>{
        val lstHotel: ArrayList<HotelModel> = ArrayList()

        lstHotel.add(
            HotelModel(1, R.drawable.esan, "SKyline HAven Hotel", "4.5 de 5", "123 Esan, Lima"
                , "$98")
        )
        lstHotel.add(
            HotelModel(2, R.drawable.upc, "Ocean Retreat", "4. de 5", "123 UPC, Lima"
                , "$86")
        )
        lstHotel.add(
            HotelModel(3, R.drawable.ulima, "Golden Palm Resort", "3.8 de 5", "123 ULIMA, Lima"
                , "$68")
        )
        lstHotel.add(
            HotelModel(4, R.drawable.pucp, "Royal Horizon Suites", "3.5 de 5", "123 PUCP, Lima"
                , "$77")
        )

        return lstHotel
    }
}