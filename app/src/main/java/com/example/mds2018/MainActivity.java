package com.example.mds2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.AppCenter;

public class MainActivity extends AppCompatActivity {

    private static final String APP_CENTER_KEY = "f42aded6-68b0-4af0-8c44-bd83d467758a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);

        AppCenter.start(getApplication(), APP_CENTER_KEY, Distribute.class);
    }
}
