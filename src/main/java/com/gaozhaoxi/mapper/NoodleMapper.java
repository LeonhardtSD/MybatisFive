package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.Noodle;

import java.util.List;

/**
 * @author Leon
 */
public interface NoodleMapper {
    List<Noodle> findNoodleByArea();
}
