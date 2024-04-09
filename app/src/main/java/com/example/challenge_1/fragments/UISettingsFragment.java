package com.example.challenge_1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.challenge_1.R;
import com.example.challenge_1.databinding.FragmentUISettingsBinding;


public class UISettingsFragment extends Fragment {
    FragmentUISettingsBinding fragmentUISettingsBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentUISettingsBinding = FragmentUISettingsBinding.inflate(inflater, container, false);
        return fragmentUISettingsBinding.getRoot();
    }
}