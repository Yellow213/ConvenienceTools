package com.dist.model;

import java.io.Serializable;

/**
 * @author dingchw
 * @date 2019/2/26.
 */
public class Payment implements Serializable {
    private String paycode;
    private String banktypecode;

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public String getBanktypecode() {
        return banktypecode;
    }

    public void setBanktypecode(String banktypecode) {
        this.banktypecode = banktypecode;
    }
}
