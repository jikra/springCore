package cz.cizek.edu.lifecycle.bean;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Component
public class ContainerCallbackBean implements SmartLifecycle {

    private boolean running = false;

    public boolean isAutoStartup() {
        return true;
    }

    public void stop(Runnable callback) {
        System.out.println("stop");
    }

    public void start() {
        this.running = true;
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public boolean isRunning() {
        return running;
    }

    public int getPhase() {
        return 0;
    }
}
