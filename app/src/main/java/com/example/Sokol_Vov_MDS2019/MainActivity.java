package com.example.Sokol_Vov_MDS2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import com.crashlytics.android.Crashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;

import com.crashlytics.android.ndk.CrashlyticsNdk;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private static final String APP_CENTER_KEY = "f42aded6-68b0-4af0-8c44-bd83d467758a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);

        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        AppCenter.start(getApplication(), APP_CENTER_KEY, Distribute.class);
    }
}
