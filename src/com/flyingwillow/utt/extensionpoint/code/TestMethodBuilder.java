package com.flyingwillow.utt.extensionpoint.code;

import com.flyingwillow.utt.domain.ProjectInfo;

public interface TestMethodBuilder {

    boolean match(ProjectInfo projectInfo);

    String build();
}
