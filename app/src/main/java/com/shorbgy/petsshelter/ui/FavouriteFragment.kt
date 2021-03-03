package com.shorbgy.petsshelter.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shorbgy.petsshelter.R

class FavouriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (requireActivity() as HomeActivity).toolbar.title = "Favourite"

        return inflater.inflate(R.layout.fragment_favourite, container, false)
    }
}