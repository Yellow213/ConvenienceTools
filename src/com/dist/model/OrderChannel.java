package com.dist.model;

import java.io.Serializable;

/**
 * @author hh
 * @date 2019/02/28
 */
public class OrderChannel implements Serializable{
    private String orderChannelCode;

    public String getOrderChannelCode() {
        return orderChannelCode;
    }

    public void setOrderChannelCode(String orderChannelCode) {
        this.orderChannelCode = orderChannelCode;
    }
}
