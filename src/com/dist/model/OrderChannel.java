package com.dist.model;

import java.io.Serializable;

/**
 * @author ChiV3n
 * @date 2019/2/26.
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
