package com.flyingwillow.utt.extensionpoint.dependence;

import com.flyingwillow.utt.domain.Dependence;
import com.flyingwillow.utt.domain.ProjectInfo;

import java.util.List;

/**
 *
 * */
public interface DependenceBuilder {

    /**
     *
     * */
    boolean match(ProjectInfo projectInfo);

    List<Dependence> getDependenceList();
}
