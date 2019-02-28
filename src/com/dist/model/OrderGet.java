package com.dist.model;

import java.io.Serializable;
import java.util.List;

public class OrderGet implements Serializable{ 
        private String orderCode;//苏宁订单号
    	private String userName;//
    	private String customerName;//
    	private String productName;//商品中文名称
    	private String provinceCode;//
    	private String cityCode;//
    	private String districtCode;//数量
    	private String customerAddress;//地址
    	private String mobNum;//
    	private String orderSaleTime;//
    	private String evaluationMark;//
    	private String invoiceHead;//
    	private String orderTotalStatus;//
    	private String provinceName;//
    	private String cityName;//
    	private String districtName;//
    	private String sellerOrdRemark;
    	private String buyerOrdRemark;//
    	private String invoiceType;//
    	private String invoice;//
    	private String vatTaxpayerNumber;//
    	private String registerAddress;//
    	private String registerPhone;//
    	private String bank;//
    	private String account;//
    	private String invoiceRecipientAddress;//
    	private String invoiceRecipientName;//
    	private String invoiceRecipientPhone;//
    	private String invoiceRecipientHandPhone;//
    	private String payType;//
    	private String payTotalAmount;//
    	private String needinvoiceflag;//
    	private String isCanModifyTransportFee;//
    	private String guideAccountNo;//
    	private String orderTime;//
    	private String colorMarkFlags;//
    	private String phoneNum;//
    	private String zipCode;//
    	private String deliveryArea;//
    	private String detailAddress;//
    	private String countMoney;//
    	private String sumDonationAmt;//
    	
        private List<OrderDetail> orderDetail;

        public List<OrderDetail> getOrderDetail() {
            return orderDetail;
        }

        public void setOrderDetail(List<OrderDetail> orderDetail) {
            this.orderDetail = orderDetail;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProvinceCode() {
			return provinceCode;
		}

		public void setProvinceCode(String provinceCode) {
			this.provinceCode = provinceCode;
		}

		public String getCityCode() {
			return cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getDistrictCode() {
			return districtCode;
		}

		public void setDistrictCode(String districtCode) {
			this.districtCode = districtCode;
		}

		public String getCustomerAddress() {
			return customerAddress;
		}

		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		public String getMobNum() {
			return mobNum;
		}

		public void setMobNum(String mobNum) {
			this.mobNum = mobNum;
		}

		public String getOrderSaleTime() {
			return orderSaleTime;
		}

		public void setOrderSaleTime(String orderSaleTime) {
			this.orderSaleTime = orderSaleTime;
		}

		public String getEvaluationMark() {
			return evaluationMark;
		}

		public void setEvaluationMark(String evaluationMark) {
			this.evaluationMark = evaluationMark;
		}

		public String getInvoiceHead() {
			return invoiceHead;
		}

		public void setInvoiceHead(String invoiceHead) {
			this.invoiceHead = invoiceHead;
		}

		public String getOrderTotalStatus() {
			return orderTotalStatus;
		}

		public void setOrderTotalStatus(String orderTotalStatus) {
			this.orderTotalStatus = orderTotalStatus;
		}

		public String getProvinceName() {
			return provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getDistrictName() {
			return districtName;
		}

		public void setDistrictName(String districtName) {
			this.districtName = districtName;
		}

		public String getSellerOrdRemark() {
			return sellerOrdRemark;
		}

		public void setSellerOrdRemark(String sellerOrdRemark) {
			this.sellerOrdRemark = sellerOrdRemark;
		}

		public String getBuyerOrdRemark() {
			return buyerOrdRemark;
		}

		public void setBuyerOrdRemark(String buyerOrdRemark) {
			this.buyerOrdRemark = buyerOrdRemark;
		}

		public String getInvoiceType() {
			return invoiceType;
		}

		public void setInvoiceType(String invoiceType) {
			this.invoiceType = invoiceType;
		}

		public String getInvoice() {
			return invoice;
		}

		public void setInvoice(String invoice) {
			this.invoice = invoice;
		}

		public String getVatTaxpayerNumber() {
			return vatTaxpayerNumber;
		}

		public void setVatTaxpayerNumber(String vatTaxpayerNumber) {
			this.vatTaxpayerNumber = vatTaxpayerNumber;
		}

		public String getRegisterAddress() {
			return registerAddress;
		}

		public void setRegisterAddress(String registerAddress) {
			this.registerAddress = registerAddress;
		}

		public String getRegisterPhone() {
			return registerPhone;
		}

		public void setRegisterPhone(String registerPhone) {
			this.registerPhone = registerPhone;
		}

		public String getBank() {
			return bank;
		}

		public void setBank(String bank) {
			this.bank = bank;
		}

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getInvoiceRecipientAddress() {
			return invoiceRecipientAddress;
		}

		public void setInvoiceRecipientAddress(String invoiceRecipientAddress) {
			this.invoiceRecipientAddress = invoiceRecipientAddress;
		}

		public String getInvoiceRecipientName() {
			return invoiceRecipientName;
		}

		public void setInvoiceRecipientName(String invoiceRecipientName) {
			this.invoiceRecipientName = invoiceRecipientName;
		}

		public String getInvoiceRecipientPhone() {
			return invoiceRecipientPhone;
		}

		public void setInvoiceRecipientPhone(String invoiceRecipientPhone) {
			this.invoiceRecipientPhone = invoiceRecipientPhone;
		}

		public String getInvoiceRecipientHandPhone() {
			return invoiceRecipientHandPhone;
		}

		public void setInvoiceRecipientHandPhone(String invoiceRecipientHandPhone) {
			this.invoiceRecipientHandPhone = invoiceRecipientHandPhone;
		}

		public String getPayType() {
			return payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPayTotalAmount() {
			return payTotalAmount;
		}

		public void setPayTotalAmount(String payTotalAmount) {
			this.payTotalAmount = payTotalAmount;
		}

		public String getNeedinvoiceflag() {
			return needinvoiceflag;
		}

		public void setNeedinvoiceflag(String needinvoiceflag) {
			this.needinvoiceflag = needinvoiceflag;
		}

		public String getIsCanModifyTransportFee() {
			return isCanModifyTransportFee;
		}

		public void setIsCanModifyTransportFee(String isCanModifyTransportFee) {
			this.isCanModifyTransportFee = isCanModifyTransportFee;
		}

		public String getGuideAccountNo() {
			return guideAccountNo;
		}

		public void setGuideAccountNo(String guideAccountNo) {
			this.guideAccountNo = guideAccountNo;
		}

		public String getOrderTime() {
			return orderTime;
		}

		public void setOrderTime(String orderTime) {
			this.orderTime = orderTime;
		}

		public String getColorMarkFlags() {
			return colorMarkFlags;
		}

		public void setColorMarkFlags(String colorMarkFlags) {
			this.colorMarkFlags = colorMarkFlags;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public String getDeliveryArea() {
			return deliveryArea;
		}

		public void setDeliveryArea(String deliveryArea) {
			this.deliveryArea = deliveryArea;
		}

		public String getDetailAddress() {
			return detailAddress;
		}

		public void setDetailAddress(String detailAddress) {
			this.detailAddress = detailAddress;
		}

		public String getCountMoney() {
			return countMoney;
		}

		public void setCountMoney(String countMoney) {
			this.countMoney = countMoney;
		}

		public String getSumDonationAmt() {
			return sumDonationAmt;
		}

		public void setSumDonationAmt(String sumDonationAmt) {
			this.sumDonationAmt = sumDonationAmt;
		}
        
    }