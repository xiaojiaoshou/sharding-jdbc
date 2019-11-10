package com.example.myshardingjdbc.service;

import com.example.myshardingjdbc.MyShardingJdbcApplication;
import com.example.myshardingjdbc.entity.OrderEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyShardingJdbcApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class OrderServiceTest {
    @Autowired
    private  OrderService orderService;

    @Test
    public void findByOrderId() {
        OrderEntity orderEntity = orderService.findByOrderId(400321702501810177L);
        System.out.println("查询结果=" + orderEntity);
        System.out.println("查询结果=" + orderEntity);

    }
    @Test
    public  void listByOrderIds(){
        List<Long> list=new ArrayList<>();
        list.add(400321702501810178L);
        list.add(400321702501810178L);
        List<OrderEntity> orderEntities = orderService.listByOrderIds(list);
        System.out.println("查询结果=" + orderEntities);
        System.out.println("查询结果=" + orderEntities);

    }

    @Test
    public void listRang() {
        List<OrderEntity> orderEntities = orderService.listRang(400321702501810179L, 400321714300387329L);
        System.out.println("查询结果=" + orderEntities);
        System.out.println("查询结果=" + orderEntities);
    }
}