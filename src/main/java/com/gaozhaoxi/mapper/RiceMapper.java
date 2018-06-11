package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.Food;
import com.gaozhaoxi.entity.Rice;

import java.util.List;

/**
 * @author Leon
 */
public interface RiceMapper {
     List<Rice> findRiceByArea();

}
