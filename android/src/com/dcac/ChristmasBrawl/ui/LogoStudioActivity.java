package com.dcac.ChristmasBrawl.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.dcac.ChristmasBrawl.utils.BaseActivity;
import com.dcac.simplegame.databinding.ActivityLogoStudioBinding;


public class LogoStudioActivity extends BaseActivity<ActivityLogoStudioBinding> {

    @Override
    protected ActivityLogoStudioBinding getViewBinding() {
        return ActivityLogoStudioBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.dcacStudioImage.setOnClickListener(v -> {
            openMenuActivity();
        });
    }

    private void openMenuActivity() {
        Intent intent = new Intent(this, MenuActivity.class); // Remplacez MenuActivity.class par le nom réel de votre activité cible
        startActivity(intent);
        finish();
    }

}