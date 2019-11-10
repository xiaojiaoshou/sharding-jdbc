package com.example.myshardingjdbc.service;

import com.example.myshardingjdbc.entity.OrderEntity;
import com.example.myshardingjdbc.mapper.OrderEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService {
    @Autowired
    private OrderEntityMapper orderEntityMapper;

    public OrderEntity findByOrderId(Long orderId) {
        OrderEntity orderEntity = orderEntityMapper.selectByPrimaryKey(orderId);
        return orderEntity;
    }

    public List<OrderEntity> listByOrderIds(List<Long> orderIds) {
        return orderEntityMapper.listByOrderIds(orderIds);
    }

    public List<OrderEntity> listRang(Long minOrderId, Long MaxOrderId) {
        return orderEntityMapper.listRang(minOrderId,MaxOrderId);
    }


}
