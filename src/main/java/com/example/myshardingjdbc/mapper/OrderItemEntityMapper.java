package com.example.myshardingjdbc.mapper;

import com.example.myshardingjdbc.entity.OrderItemEntity;
import com.example.myshardingjdbc.entity.OrderItemEntityExample;

public interface OrderItemEntityMapper {
    int countByExample(OrderItemEntityExample example);

    int deleteByPrimaryKey(Long orderItemId);

    int insert(OrderItemEntity record);

    int insertSelective(OrderItemEntity record);

    OrderItemEntity selectByPrimaryKey(Long orderItemId);

    int updateByPrimaryKeySelective(OrderItemEntity record);

    int updateByPrimaryKey(OrderItemEntity record);
}