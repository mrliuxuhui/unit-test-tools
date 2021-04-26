package com.flyingwillow.utt.extensionpoint.dependence;

import com.flyingwillow.utt.domain.Dependence;
import com.flyingwillow.utt.domain.ProjectInfo;

import java.util.List;

/**
 * check dependencies and write the dependencies to the dependence manage file
 * such as gradle or maven
 * */
public interface DependenceManager {

    /**
     * */
    boolean match(ProjectInfo projectInfo);

    /**
     *
     * */
    void setupIfNecessary(List<Dependence> list);
}
