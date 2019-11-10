package com.example.myshardingjdbc.mapper;

import com.example.myshardingjdbc.entity.OrderEntity;
import com.example.myshardingjdbc.entity.OrderEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderEntityMapper {
    int countByExample(OrderEntityExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    OrderEntity selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);

    List<OrderEntity> listByOrderIds(List<Long> list);

    List<OrderEntity> listRang(@Param("minOrderId") Long minOrderId,@Param("maxOrderId") Long maxOrderId);
}