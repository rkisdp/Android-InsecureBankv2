package com.android.insecurebankv2;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class SecureBaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
        );
        super.onCreate(savedInstanceState);
    }
}
