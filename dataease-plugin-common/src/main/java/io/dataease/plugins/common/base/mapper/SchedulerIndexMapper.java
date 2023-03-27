package io.dataease.plugins.common.base.mapper;

import io.dataease.plugins.common.base.domain.SchedulerIndex;
import io.dataease.plugins.common.base.domain.SchedulerIndexExample;
import io.dataease.plugins.common.base.domain.SchedulerIndexWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulerIndexMapper {
    long countByExample(SchedulerIndexExample example);

    int deleteByExample(SchedulerIndexExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SchedulerIndexWithBLOBs record);

    int insertSelective(SchedulerIndexWithBLOBs record);

    List<SchedulerIndexWithBLOBs> selectByExampleWithBLOBs(SchedulerIndexExample example);

    List<SchedulerIndex> selectByExample(SchedulerIndexExample example);

    SchedulerIndexWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SchedulerIndexWithBLOBs record, @Param("example") SchedulerIndexExample example);

    int updateByExampleWithBLOBs(@Param("record") SchedulerIndexWithBLOBs record, @Param("example") SchedulerIndexExample example);

    int updateByExample(@Param("record") SchedulerIndex record, @Param("example") SchedulerIndexExample example);

    int updateByPrimaryKeySelective(SchedulerIndexWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SchedulerIndexWithBLOBs record);

    int updateByPrimaryKey(SchedulerIndex record);
}