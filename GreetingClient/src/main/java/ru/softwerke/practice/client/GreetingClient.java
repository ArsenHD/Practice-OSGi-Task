package ru.softwerke.practice.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import ru.softwerke.practice.greeting.Greeting;

public class GreetingClient implements BundleActivator {
    public void start(BundleContext bundleContext) {
        ServiceReference<?> ref = bundleContext.getServiceReference(Greeting.class.getName());
        if (ref != null) {
            Greeting service = (Greeting) bundleContext.getService(ref);
            if (service != null) {
                service.greet();
            } else {
                printServiceInstanceAcquirementFailure();
            }
        } else {
            printServiceIsNotAvailableMessage();
        }
    }

    public void stop(BundleContext bundleContext) {
        ServiceReference<?> ref = bundleContext.getServiceReference(Greeting.class.getName());
        if (ref != null) {
            Greeting service = (Greeting) bundleContext.getService(ref);
            if (service != null) {
                service.goodbye();
            } else {
                printServiceInstanceAcquirementFailure();
            }
        } else {
            printServiceIsNotAvailableMessage();
        }
    }

    private void printServiceIsNotAvailableMessage() {
        System.out.println("Greeting service is not available");
    }

    private void printServiceInstanceAcquirementFailure() {
        System.out.println("Failed to get Greeting service instance");
    }
}
