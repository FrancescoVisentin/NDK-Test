package com.test.ndk

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val storeButton = view.findViewById<Button>(R.id.button1)
        storeButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_mainFragment_to_storeFragment)
        }

        val levelsFragment = view.findViewById<Button>(R.id.button2)
        levelsFragment.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_mainFragment_to_levelsFragment)
        }

        val playButton = view.findViewById<Button>(R.id.button3)
        playButton.setOnClickListener{
            val myIntent = Intent(activity, PlayActivity::class.java)
            startActivity(myIntent)
        }

        return view
    }
}