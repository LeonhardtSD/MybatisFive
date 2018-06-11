package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.City;

import java.util.List;

/**
 * @author Leon
 */
public interface CityMapper {
    List<City> findCityByPid(Long pid);
}
