package com.is3av.vibrator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class VibratorActivity extends Activity {
private Button button;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(butListener);
    }
    private OnClickListener butListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
			long milliseconds = 1000;
			vib.vibrate(milliseconds);
		}
	};
}
