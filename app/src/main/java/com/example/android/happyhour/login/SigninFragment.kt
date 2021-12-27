package com.example.android.happyhour.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.happyhour.R
import com.example.android.happyhour.databinding.FragmentSigninBinding
import kotlinx.android.synthetic.main.fragment_signin.*

class SigninFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSigninBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_signin, container, false
        )

//        navigate to messages fragment when login is clicked
        binding.loginButton.setOnClickListener {
            if (companyCheckBox.isChecked){
                findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToSellerMessagesFragment())
            }else{
                findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToBuyerMessagesFragment())
            }
        }

        binding.signupButton.setOnClickListener {
            if (companyCheckBox.isChecked){
                findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToSellerMessagesFragment())
            }else{
                findNavController().navigate(SigninFragmentDirections.actionSigninFragmentToBuyerMessagesFragment())
            }
        }
//        return xml root
        return binding.root
    }

}