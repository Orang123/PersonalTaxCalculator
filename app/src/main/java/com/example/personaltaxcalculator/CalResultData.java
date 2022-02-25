package com.example.personaltaxcalculator;

import android.os.Parcel;
import android.os.Parcelable;


public class CalResultData implements Parcelable {

    private int monthNumbers;
    private double beforeTaxSalary0,insure0,specifieDeduction0,startLevyPoint0;
    private double totalBeforeTaxSalary0,totalInsure0,totalSpecifieDeduction0,totalStartLevyPoint0;
    private double lastMonthTotalBeforeTaxSalary,lastMonthTotalInsure,lastMonthTotalSpecifieDeduction,lastMonthTotalStartLevyPoint;
    private double getTaxMoney0,lastMonthgetTaxMoney;
    private double totalTaxMoney0,totalAlreadyTaxMoney0;
    private double taxRate1,taxRate2,quickCalculateDigit0;
    private double currentPersonalTax0,afterTaxSalary0;

    public CalResultData() {
        super();
    }

    public int getMonthNumbers() {
        return monthNumbers;
    }

    public void setMonthNumbers(int monthNumbers) {
        this.monthNumbers = monthNumbers;
    }

    public void setBeforeTaxSalary0(double beforeTaxSalary0) {
        this.beforeTaxSalary0 = beforeTaxSalary0;
    }

    public void setInsure0(double insure0) {
        this.insure0 = insure0;
    }

    public void setSpecifieDeduction0(double specifieDeduction0) {
        this.specifieDeduction0 = specifieDeduction0;
    }

    public void setStartLevyPoint0(double startLevyPoint0) {
        this.startLevyPoint0 = startLevyPoint0;
    }

    public void setTotalBeforeTaxSalary0(double totalBeforeTaxSalary0) {
        this.totalBeforeTaxSalary0 = totalBeforeTaxSalary0;
    }

    public void setTotalInsure0(double totalInsure0) {
        this.totalInsure0 = totalInsure0;
    }

    public void setTotalSpecifieDeduction0(double totalSpecifieDeduction0) {
        this.totalSpecifieDeduction0 = totalSpecifieDeduction0;
    }

    public void setTotalStartLevyPoint0(double totalStartLevyPoint0) {
        this.totalStartLevyPoint0 = totalStartLevyPoint0;
    }

    public void setLastMonthTotalBeforeTaxSalary(double lastMonthTotalBeforeTaxSalary) {
        this.lastMonthTotalBeforeTaxSalary = lastMonthTotalBeforeTaxSalary;
    }

    public void setLastMonthTotalInsure(double lastMonthTotalInsure) {
        this.lastMonthTotalInsure = lastMonthTotalInsure;
    }

    public void setLastMonthTotalSpecifieDeduction(double lastMonthTotalSpecifieDeduction) {
        this.lastMonthTotalSpecifieDeduction = lastMonthTotalSpecifieDeduction;
    }

    public void setLastMonthTotalStartLevyPoint(double lastMonthTotalStartLevyPoint) {
        this.lastMonthTotalStartLevyPoint = lastMonthTotalStartLevyPoint;
    }

    public void setGetTaxMoney0(double getTaxMoney0) {
        this.getTaxMoney0 = getTaxMoney0;
    }

    public void setLastMonthgetTaxMoney(double lastMonthgetTaxMoney) {
        this.lastMonthgetTaxMoney = lastMonthgetTaxMoney;
    }

    public void setTotalTaxMoney0(double totalTaxMoney0) {
        this.totalTaxMoney0 = totalTaxMoney0;
    }

    public void setTotalAlreadyTaxMoney0(double totalAlreadyTaxMoney0) {
        this.totalAlreadyTaxMoney0 = totalAlreadyTaxMoney0;
    }

    public void setTaxRate1(double taxRate0) {
        this.taxRate1 = taxRate0;
    }

    public void setQuickCalculateDigit0(double quickCalculateDigit0) {
        this.quickCalculateDigit0 = quickCalculateDigit0;
    }

    public void setCurrentPersonalTax0(double currentPersonalTax0) {
        this.currentPersonalTax0 = currentPersonalTax0;
    }

    public void setAfterTaxSalary0(double afterTaxSalary0) {
        this.afterTaxSalary0 = afterTaxSalary0;
    }

    public double getBeforeTaxSalary0() {
        return beforeTaxSalary0;
    }

    public double getInsure0() {
        return insure0;
    }

    public double getSpecifieDeduction0() {
        return specifieDeduction0;
    }

    public double getStartLevyPoint0() {
        return startLevyPoint0;
    }

    public double getTotalBeforeTaxSalary0() {
        return totalBeforeTaxSalary0;
    }

    public double getTotalInsure0() {
        return totalInsure0;
    }

    public double getTotalSpecifieDeduction0() {
        return totalSpecifieDeduction0;
    }

    public double getTotalStartLevyPoint0() {
        return totalStartLevyPoint0;
    }

    public double getLastMonthTotalBeforeTaxSalary() {
        return lastMonthTotalBeforeTaxSalary;
    }

    public double getLastMonthTotalInsure() {
        return lastMonthTotalInsure;
    }

    public double getLastMonthTotalSpecifieDeduction() {
        return lastMonthTotalSpecifieDeduction;
    }

    public double getLastMonthTotalStartLevyPoint() {
        return lastMonthTotalStartLevyPoint;
    }

    public double getGetTaxMoney0() {
        return getTaxMoney0;
    }

    public double getLastMonthgetTaxMoney() {
        return lastMonthgetTaxMoney;
    }

    public double getTotalTaxMoney0() {
        return totalTaxMoney0;
    }

    public double getTotalAlreadyTaxMoney0() {
        return totalAlreadyTaxMoney0;
    }

    public double getTaxRate1() {
        return taxRate1;
    }

    public double getQuickCalculateDigit0() {
        return quickCalculateDigit0;
    }

    public double getCurrentPersonalTax0() {
        return currentPersonalTax0;
    }

    public double getAfterTaxSalary0() {
        return afterTaxSalary0;
    }

    public void setTaxRate2(double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public double getTaxRate2() {
        return taxRate2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public CalResultData(Parcel source) {
        this.monthNumbers = source.readInt();
        this.beforeTaxSalary0 = source.readDouble();
        this.insure0 = source.readDouble();
        this.specifieDeduction0 = source.readDouble();
        this.startLevyPoint0 = source.readDouble();
        this.totalBeforeTaxSalary0 = source.readDouble();
        this.totalInsure0 = source.readDouble();
        this.totalSpecifieDeduction0 = source.readDouble();
        this.totalStartLevyPoint0 = source.readDouble();
        this.lastMonthTotalBeforeTaxSalary = source.readDouble();
        this.lastMonthTotalInsure = source.readDouble();
        this.lastMonthTotalSpecifieDeduction = source.readDouble();
        this.lastMonthTotalStartLevyPoint = source.readDouble();
        this.getTaxMoney0 = source.readDouble();
        this.lastMonthgetTaxMoney = source.readDouble();
        this.totalTaxMoney0 = source.readDouble();
        this.totalAlreadyTaxMoney0 = source.readDouble();
        this.taxRate1 = source.readDouble();
        this.taxRate2 = source.readDouble();
        this.quickCalculateDigit0 = source.readDouble();
        this.currentPersonalTax0 = source.readDouble();
        this.afterTaxSalary0 = source.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(monthNumbers);
        dest.writeDouble(beforeTaxSalary0);
        dest.writeDouble(insure0);
        dest.writeDouble(specifieDeduction0);
        dest.writeDouble(startLevyPoint0);
        dest.writeDouble(totalBeforeTaxSalary0);
        dest.writeDouble(totalInsure0);
        dest.writeDouble(totalSpecifieDeduction0);
        dest.writeDouble(totalStartLevyPoint0);
        dest.writeDouble(lastMonthTotalBeforeTaxSalary);
        dest.writeDouble(lastMonthTotalInsure);
        dest.writeDouble(lastMonthTotalSpecifieDeduction);
        dest.writeDouble(lastMonthTotalStartLevyPoint);
        dest.writeDouble(getTaxMoney0);
        dest.writeDouble(lastMonthgetTaxMoney);
        dest.writeDouble(totalTaxMoney0);
        dest.writeDouble(totalAlreadyTaxMoney0);
        dest.writeDouble(taxRate1);
        dest.writeDouble(taxRate2);
        dest.writeDouble(quickCalculateDigit0);
        dest.writeDouble(currentPersonalTax0);
        dest.writeDouble(afterTaxSalary0);
    }

    public static final Creator<CalResultData> CREATOR=new Creator<CalResultData>() {
        @Override
        public CalResultData createFromParcel(Parcel source) {
            return new CalResultData(source);
        }

        @Override
        public CalResultData[] newArray(int size) {
            return new CalResultData[size];
        }
    };
}
