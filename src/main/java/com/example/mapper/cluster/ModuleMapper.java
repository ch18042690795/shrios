package com.example.mapper.cluster;

import com.example.domain.Module;

public interface ModuleMapper {
    int insert(Module record);

    int insertSelective(Module record);
}