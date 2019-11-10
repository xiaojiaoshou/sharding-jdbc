package com.example.myshardingjdbc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Table: t_order_0
 */
@Data
public class OrderEntity implements Serializable {
    /**
     * Table:     t_order_0
     * Column:    order_id
     * Nullable:  false
     */
    private Long orderId;

    /**
     * Table:     t_order_0
     * Column:    user_id
     * Nullable:  false
     */
    private Integer userId;

    /**
     * Table:     t_order_0
     * Column:    status
     * Nullable:  true
     */
    private String status;

    private static final long serialVersionUID = 1L;
}