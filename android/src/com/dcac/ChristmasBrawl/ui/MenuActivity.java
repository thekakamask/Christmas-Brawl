package com.dcac.ChristmasBrawl.ui;

import android.os.Bundle;

import com.dcac.ChristmasBrawl.utils.BaseActivity;
import com.dcac.simplegame.databinding.ActivityMenuBinding;

public class MenuActivity extends BaseActivity<ActivityMenuBinding> {

    protected ActivityMenuBinding getViewBinding(){
        return ActivityMenuBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}