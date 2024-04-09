package com.example.challenge_1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.challenge_1.adapters.SettingsFragmentAdapter;
import com.example.challenge_1.databinding.FragmentSettingsBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class SettingsFragment extends Fragment {
    FragmentSettingsBinding fragmentSettingsBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false);
        return fragmentSettingsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupTabLayout();
    }

    private void setupTabLayout() {
        ViewPager2 viewPager2 = fragmentSettingsBinding.viewPager;
        TabLayout tabLayout = fragmentSettingsBinding.tabLayout;

        viewPager2.setAdapter(new SettingsFragmentAdapter(this));
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position) {
                case 0: {
                    tab.setText("UI");
                    break;
                }
                default:
                    tab.setText("Behavior");
            }
        }).attach();
    }
}