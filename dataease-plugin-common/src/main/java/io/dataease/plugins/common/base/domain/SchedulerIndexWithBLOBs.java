package io.dataease.plugins.common.base.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SchedulerIndexWithBLOBs extends SchedulerIndex implements Serializable {
    private String indexField;

    private String timeField;

    private String rules;

    private String sends;

    private Long success;

    private Long failed;

    private String lastTime;

    private boolean status;

    private static final long serialVersionUID = 1L;
}