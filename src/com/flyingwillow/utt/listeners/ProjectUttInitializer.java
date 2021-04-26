package com.flyingwillow.utt.listeners;

import com.flyingwillow.utt.services.ProjectInfoService;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import org.jetbrains.annotations.NotNull;

public class ProjectUttInitializer implements ProjectManagerListener{

    private Logger logger = Logger.getInstance(ProjectUttInitializer.class);

    @Override
    public void projectOpened(@NotNull Project project) {

        logger.info("project opened");
        ProjectInfoService projectInfoService = ServiceManager.getService(ProjectInfoService.class);

        // collect project info
        projectInfoService.collectProjectInfo(project);

        // check dependencies
        projectInfoService.checkDependencies();

        // publish event -> to reading saved utt data, rendering icons on method

        logger.info("project initialization completed!");
    }

    @Override
    public void projectClosing(@NotNull Project project) {

        logger.info("project closing");
        // saving utt data
    }
}
