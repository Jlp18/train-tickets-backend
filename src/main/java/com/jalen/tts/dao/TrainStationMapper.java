package com.jalen.tts.dao;

import com.jalen.tts.bean.SelectedResults;
import com.jalen.tts.bean.TrainStation;
import com.jalen.tts.bean.TrainStationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainStationMapper {
	
	int getSelectsCount();
	
	List<SelectedResults> selectTrainByFromAndTo(SelectedResults selectedResults);
	
    long countByExample(TrainStationExample example);

    int deleteByExample(TrainStationExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(TrainStation record);

    int insertSelective(TrainStation record);

    List<TrainStation> selectByExample(TrainStationExample example);

    TrainStation selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") TrainStation record, @Param("example") TrainStationExample example);

    int updateByExample(@Param("record") TrainStation record, @Param("example") TrainStationExample example);

    int updateByPrimaryKeySelective(TrainStation record);

    int updateByPrimaryKey(TrainStation record);
}