package com.efs.sdk.pa;

public interface PATraceListener {
    void onAnrTrace();

    void onCheck(boolean z);

    void onUnexcept(Object obj);
}
