package com.jalen.tts.dao;

import com.jalen.tts.bean.SelectedResults;
import com.jalen.tts.bean.SelectedResultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectedResultsMapper {
    long countByExample(SelectedResultsExample example);

    int deleteByExample(SelectedResultsExample example);

    int insert(SelectedResults record);

    int insertSelective(SelectedResults record);

    List<SelectedResults> selectByExample(SelectedResultsExample example);

    int updateByExampleSelective(@Param("record") SelectedResults record, @Param("example") SelectedResultsExample example);

    int updateByExample(@Param("record") SelectedResults record, @Param("example") SelectedResultsExample example);
}