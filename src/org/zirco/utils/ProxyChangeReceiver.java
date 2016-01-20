package org.zirco.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import org.zirco.ui.activities.MainActivity;

public class ProxyChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("ProxyChangeReceiver", "Proxy change receiver called: " + intent.toString());

        if (MainActivity.INSTANCE != null) {
            Log.d("ProxyChangeReceiver", "Refresh system preferences");
            MainActivity.INSTANCE.applyPreferences();
        }
    }
}
