package ch.schoeb.exercise07_service_solution;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class CounterService extends Service {

    public class CounterServiceBinder extends Binder {
        public CounterService getService() {
            return CounterService.this;
        }
    }

    private final IBinder _binder = new CounterServiceBinder();

    private int _counter = 0;

    public CounterService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return _binder;
    }

    public void increaseCounter() {
        _counter++;
    }

    public int getCounter() {
        return _counter;
    }
}
