package com.star.design.factory.dto.color;

import java.io.Serializable;

public class ExcelExportDto implements Serializable {
    private static final long serialVersionUID = 1258278262140384069L;
    /**
     *基础口令
     */
    private String basicMouthWord;
    /**
     *账期
     */
    private String accountingPeriod;
    /**
     *资费计划编码
     */
    private String planCode;
    /**
     *资费科目编码
     */
    private String subjectCode;
    /**
     *优惠前应收金额
     */
    private String beforeMoney;
    /**
     *优惠后应收金额
     */
    private String afterMoney;
    /**
     *税率
     */
    private String taxRate;
    /**
     *客户经理名称
     */
    private String managerName;
    /**
     *客户经理电话
     */
    private String managerPhone;
    /**
     *客户联系人姓名
     */
    private String customerName;
    /**
     *客户联系人电话
     */
    private String customerPhone;

    public String getBasicMouthWord() {
        return basicMouthWord;
    }

    public void setBasicMouthWord(String basicMouthWord) {
        this.basicMouthWord = basicMouthWord;
    }

    public String getAccountingPeriod() {
        return accountingPeriod;
    }

    public void setAccountingPeriod(String accountingPeriod) {
        this.accountingPeriod = accountingPeriod;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getBeforeMoney() {
        return beforeMoney;
    }

    public void setBeforeMoney(String beforeMoney) {
        this.beforeMoney = beforeMoney;
    }

    public String getAfterMoney() {
        return afterMoney;
    }

    public void setAfterMoney(String afterMoney) {
        this.afterMoney = afterMoney;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
