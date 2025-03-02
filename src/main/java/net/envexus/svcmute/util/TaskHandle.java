package net.envexus.svcmute.util;

public interface TaskHandle {
    void cancel();

    boolean isCancelled();
}