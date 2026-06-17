package com.iTech.statisticservice.repository;

import com.iTech.statisticservice.entity.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StatisticRepository extends JpaRepository<Statistic, Long> {

}
