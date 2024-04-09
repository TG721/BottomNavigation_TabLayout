package com.example.challenge_1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.challenge_1.R;
import com.example.challenge_1.databinding.FragmentBehaviorSettingsBinding;

public class BehaviorSettingsFragment extends Fragment {
    FragmentBehaviorSettingsBinding fragmentBehaviorSettingsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentBehaviorSettingsBinding = FragmentBehaviorSettingsBinding.inflate(inflater, container, false);
        return fragmentBehaviorSettingsBinding.getRoot();
    }
}