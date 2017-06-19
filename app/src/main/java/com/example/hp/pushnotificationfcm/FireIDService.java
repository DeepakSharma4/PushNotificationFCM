package com.example.hp.pushnotificationfcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by hp on 6/19/2017.
 */

public class FireIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String tkn = FirebaseInstanceId.getInstance().getToken();
        Log.d("Not", "Token [" + tkn + "]");
    }
}