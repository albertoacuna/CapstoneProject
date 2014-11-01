package com.capstoneglass.capstoneproject.DAL;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DatabaseDAL extends Service {
    public DatabaseDAL() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
