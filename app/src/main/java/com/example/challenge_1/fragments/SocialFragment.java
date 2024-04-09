package com.example.challenge_1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.challenge_1.databinding.FragmentSocialBinding;

public class SocialFragment extends Fragment {


    private FragmentSocialBinding fragmentSocialBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentSocialBinding = FragmentSocialBinding.inflate(inflater, container, false);
        return fragmentSocialBinding.getRoot();
    }
}