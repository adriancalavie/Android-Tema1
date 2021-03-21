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

class FragmentThree : Fragment() {

    private var activity: IActivityFragmentCommunication? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button1 = view.findViewById<Button>(R.id.button1_f2a2)

        button1.setOnClickListener {
            if (activity != null) {
                activity?.replaceFragment(FragmentFour::class.java.name)
            }
        }

        val button2 = view.findViewById<Button>(R.id.button2_f2a2)

        button2.setOnClickListener {
            if (activity != null) {
                activity?.replaceFragment(FragmentTwo::class.java.name)
            }
        }

        val button3 = view.findViewById<Button>(R.id.button3_f2a2)

        button3.setOnClickListener {
            if (activity != null) {
                getActivity()?.finish()
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
        fun newInstance(): FragmentThree{
            return FragmentThree()
        }
    }
}