package com.example.myshardingjdbc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Table: t_order_item_0
 */
@Data
public class OrderItemEntity implements Serializable {
    /**
     * Table:     t_order_item_0
     * Column:    order_item_id
     * Nullable:  false
     */
    private Long orderItemId;

    /**
     * Table:     t_order_item_0
     * Column:    order_id
     * Nullable:  true
     */
    private Long orderId;

    /**
     * Table:     t_order_item_0
     * Column:    user_id
     * Nullable:  false
     */
    private Integer userId;

    /**
     * Table:     t_order_item_0
     * Column:    status
     * Nullable:  true
     */
    private String status;

    private static final long serialVersionUID = 1L;
}