package com.dist.model;

import java.io.Serializable;

/**
 * @author hh
 * @date 2019/02/28
 */
public class Coupon implements Serializable{
    private String coupontype;
    private String sharelimit;

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype;
    }

    public String getSharelimit() {
        return sharelimit;
    }

    public void setSharelimit(String sharelimit) {
        this.sharelimit = sharelimit;
    }
}
