package com.marcohc.toasteroid;

import android.content.Context;
import android.widget.Toast;

/**
 * Minimal local replacement for the com.github.marcohc:Toasteroid library,
 * whose source repository (and JitPack artifact) is no longer available.
 * Keeps the same API used by the app and delegates to the platform Toast.
 */
public final class Toasteroid {

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public enum STYLES {
        SUCCESS, INFO, WARNING, ERROR, DELETE
    }

    private Toasteroid() {
    }

    /**
     * Shows a toast message. The style is accepted for API compatibility only.
     */
    public static void show(Context context, String message, STYLES style, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
