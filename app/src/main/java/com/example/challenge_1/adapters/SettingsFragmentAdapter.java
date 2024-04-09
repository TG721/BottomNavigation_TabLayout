package com.example.challenge_1.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.challenge_1.fragments.BehaviorSettingsFragment;
import com.example.challenge_1.fragments.UISettingsFragment;

public class SettingsFragmentAdapter extends FragmentStateAdapter {


    public SettingsFragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new UISettingsFragment();
            default: return new BehaviorSettingsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
