package io.dataease.plugins.common.base.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class SchedulerIndex implements Serializable {
    private Long id;

    private String chartId;

    private String format;

    private Long timeNumber;

    private String timeType;

    private String cron;

    private static final long serialVersionUID = 1L;
}