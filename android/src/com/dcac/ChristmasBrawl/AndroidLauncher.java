package com.dcac.ChristmasBrawl;

import android.content.Intent;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.dcac.ChristmasBrawl.ui.LogoStudioActivity;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(this, LogoStudioActivity.class);
		startActivity(intent);

		// Termine l'activité courante pour que l'utilisateur ne puisse pas y revenir en appuyant sur le bouton de retour
		finish();

		/*AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
		config.useCompass = false;
		initialize(new Drop(), config);*/
	}
}
