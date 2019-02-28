package com.dist.model;

import java.io.Serializable;

/**
 * @author hh
 * @date 2019/02/28
 */
public class DonationProjectInfo implements Serializable{
    private String donationProjectId;
    private String donationAmt;

    public String getDonationProjectId() {
        return donationProjectId;
    }

    public void setDonationProjectId(String donationProjectId) {
        this.donationProjectId = donationProjectId;
    }

    public String getDonationAmt() {
        return donationAmt;
    }

    public void setDonationAmt(String donationAmt) {
        this.donationAmt = donationAmt;
    }
}
