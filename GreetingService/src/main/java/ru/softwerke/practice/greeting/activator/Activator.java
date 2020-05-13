package ru.softwerke.practice.greeting.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ru.softwerke.practice.greeting.Greeting;
import ru.softwerke.practice.greeting.impl.GreetingImpl;

public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) {
        bundleContext.registerService(Greeting.class.getName(), new GreetingImpl(), null);
    }

    public void stop(BundleContext bundleContext) {}
}
