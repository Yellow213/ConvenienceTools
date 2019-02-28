package com.dist.model;

import java.io.Serializable;
import java.util.List;

public class OrderDetail implements Serializable {
    private String productCode;
    private String productName;
    private List<Payment> paymentList;
    private List<Coupon> couponList;
    private List<OrderChannel> orderChannels;
    private DonationProjectInfo donationProjectInfo;
    private List<Object> activityTypes;
    private List<Object> payTypes;
    private Object popContractInfo;
    private Object carService;

    public List<Object> getActivityTypes() {
        return activityTypes;
    }

    public void setActivityTypes(List<Object> activityTypes) {
        this.activityTypes = activityTypes;
    }

    public List<Object> getPayTypes() {
        return payTypes;
    }

    public void setPayTypes(List<Object> payTypes) {
        this.payTypes = payTypes;
    }

    public Object getPopContractInfo() {
        return popContractInfo;
    }

    public void setPopContractInfo(Object popContractInfo) {
        this.popContractInfo = popContractInfo;
    }

    public Object getCarService() {
        return carService;
    }

    public void setCarService(Object carService) {
        this.carService = carService;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<Coupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<Coupon> couponList) {
        this.couponList = couponList;
    }

    public List<OrderChannel> getOrderChannels() {
        return orderChannels;
    }

    public void setOrderChannels(List<OrderChannel> orderChannels) {
        this.orderChannels = orderChannels;
    }

    public DonationProjectInfo getDonationProjectInfo() {
        return donationProjectInfo;
    }

    public void setDonationProjectInfo(DonationProjectInfo donationProjectInfo) {
        this.donationProjectInfo = donationProjectInfo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}