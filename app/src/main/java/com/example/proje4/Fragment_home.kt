package com.example.proje4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        val btn=view.findViewById<Button>(R.id.ac_frag_btn)
        var username=view.findViewById<EditText>(R.id.ac_frag_user)
        var password=view.findViewById<EditText>(R.id.ac_frag_pass)
        btn.setOnClickListener {
            if (username.text.toString()=="admin" && password.text.toString()=="admin"){
                val bundle= bundleOf("title" to "welcom admin")
                navController.navigate(R.id.action_fragment_home_to_fragment_welcome,bundle)
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStaticpackage com.example.myapplication

        import android.os.Bundle
        import androidx.fragment.app.Fragment
        import android.view.LayoutInflater
        import android.view.View
        import android.view.ViewGroup
        import android.widget.Button
        import android.widget.EditText
        import android.widget.TextView
        import android.widget.Toast
        import androidx.core.os.bundleOf
        import androidx.navigation.NavController
        import androidx.navigation.Navigation
        import com.google.android.material.bottomnavigation.BottomNavigationItemView

        // TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        /**
         * A simple [Fragment] subclass.
         * Use the [Fragment_home.newInstance] factory method to
         * create an instance of this fragment.
         */
        class Fragment_home : Fragment() {
            // TODO: Rename and change types of parameters
            private var param1: String? = null
            private var param2: String? = null
            lateinit var navController:NavController

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                arguments?.let {
                    param1 = it.getString(ARG_PARAM1)
                    param2 = it.getString(ARG_PARAM2)
                }

            }

            override fun onCreateView(
                inflater: LayoutInflater, container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View? {
                // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_home, container, false)
            }

            override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                navController=Navigation.findNavController(view)
                val btn=view.findViewById<Button>(R.id.ac_frag_btn)
                var username=view.findViewById<EditText>(R.id.ac_frag_user)
                var password=view.findViewById<EditText>(R.id.ac_frag_pass)
                btn.setOnClickListener {
                    if (username.text.toString()=="admin" && password.text.toString()=="admin"){
                        val bundle= bundleOf("title" to "welcom admin")
                        navController.navigate(R.id.action_fragment_home_to_fragment_welcome,bundle)
                    }
                }
            }

            companion object {
                /**
                 * Use this factory method to create a new instance of
                 * this fragment using the provided parameters.
                 *
                 * @param param1 Parameter 1.
                 * @param param2 Parameter 2.
                 * @return A new instance of fragment Fragment_home.
                 */
                // TODO: Rename and change types and number of parameters
                @JvmStatic
                fun newInstance(param1: String, param2: String) =
                    Fragment_home().apply {
                        arguments = Bundle().apply {
                            putString(ARG_PARAM1, param1)
                            putString(ARG_PARAM2, param2)
                        }
                    }
            }
        }
        fun newInstance(param1: String, param2: String) =
            Fragment_home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}