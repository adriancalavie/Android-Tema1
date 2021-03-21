package com.example.androidtema1.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.androidtema1.R
import com.example.androidtema1.interfaces.IActivityFragmentCommunication

class FragmentOne : Fragment() {

    private var activity: IActivityFragmentCommunication? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button_f1a1)

        button.setOnClickListener {
            if (activity != null) {
                activity?.openNextActivity()
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IActivityFragmentCommunication) {
            this.activity = context
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentOne()
    }
}