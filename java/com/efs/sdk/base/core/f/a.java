package com.efs.sdk.base.core.f;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.controller.ControllerCenter;

public abstract class a extends Handler {
    public ControllerCenter a;

    public a() {
        super(com.efs.sdk.base.core.util.concurrent.a.a.getLooper());
        sendEmptyMessageDelayed(0, 60000);
    }

    public abstract void a();

    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        a();
        sendEmptyMessageDelayed(0, 60000);
    }
}
