package com.example.androidtema1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidtema1.R
import com.example.androidtema1.interfaces.IActivityFragmentCommunication

class FragmentFour : Fragment() {

    private var activity: IActivityFragmentCommunication? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_four, container, false)
    }
    companion object {

        @JvmStatic
        fun newInstance(): FragmentFour{
            return FragmentFour()
        }
    }
}