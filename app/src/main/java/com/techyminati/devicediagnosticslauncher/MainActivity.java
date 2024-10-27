package com.techyminati.devicediagnosticslauncher;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        launchDiagnosticsApp();

        // Optionally close the launcher app after launching the diagnostics app
        finish();
    }

    private void launchDiagnosticsApp() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.devicediagnostics", "com.android.devicediagnostics.MainActivity"));
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
