package com.iTech.statisticservice.service;
import com.iTech.statisticservice.dto.StatisticDTO;

import java.util.List;



public interface StatisticService {
    void add(StatisticDTO statisticDTO);

    List<StatisticDTO> getAll();
}

