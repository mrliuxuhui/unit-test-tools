package com.flyingwillow.utt.services;

import com.flyingwillow.utt.extensionpoint.dependence.DependenceBuilder;
import com.flyingwillow.utt.extensionpoint.dependence.DependenceManager;
import com.flyingwillow.utt.domain.ProjectInfo;
import com.intellij.openapi.components.Service;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;

@Service
public class ProjectInfoService {

    private final Logger logger = Logger.getInstance(ProjectInfoService.class);

    /**
     *  project info
     * */
    private ProjectInfo projectInfo;

    /**
     * project default Dependence Manager
     * */
    private DependenceManager dependenceManager;

    /**
     * project default Dependence builder
     * */
    private DependenceBuilder dependenceBuilder;

    public ProjectInfo getProjectInfo(){
        return projectInfo;
    }

    /**
     *  initialize project info
     * */
    public void collectProjectInfo(Project project) {
        logger.info("collecting project info...");
    }

    public void checkDependencies() {
        logger.info("checking dependencies...");
    }

    /**
     *  set
     * */

}
