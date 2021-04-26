package com.flyingwillow.utt.extensionpoint.code;

import com.flyingwillow.utt.domain.ProjectInfo;

public interface TestClassBuilder {

    boolean match(ProjectInfo projectInfo);

    String build();
}
