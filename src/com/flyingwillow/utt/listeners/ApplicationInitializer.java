package com.flyingwillow.utt.listeners;

import com.flyingwillow.utt.constant.ExtensionPoints;
import com.flyingwillow.utt.services.ApplicationService;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.flyingwillow.utt.constant.ExtensionPoints.NS;

public class ApplicationInitializer implements StartupActivity {

    private final Logger logger = Logger.getInstance(ApplicationInitializer.class);

    private final Map<Class, ExtensionPointName> extensionPointMap = new HashMap<>();

    @Override
    public void runActivity(@NotNull Project project) {
        logger.info("application started");
        initExtensionPoints();
        logger.info("extension points initialized!");
        ApplicationService applicationService = ServiceManager.getService(ApplicationService.class);
        applicationService.initializeExtensions(extensionPointMap);

    }

    private void initExtensionPoints() {
        ExtensionPoints.extensionClasses.forEach(clazz -> extensionPointMap.put(clazz, ExtensionPointName.create(NS + clazz.getSimpleName())));
    }
}
