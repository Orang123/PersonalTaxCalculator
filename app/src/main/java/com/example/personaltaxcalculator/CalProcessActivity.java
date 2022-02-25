package com.example.personaltaxcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class CalProcessActivity extends AppCompatActivity {

    private TextView currentMonth;
    private TextView beforeTaxSalary;
    private TextView totalBeforeTaxSalary;
    private TextView insure;
    private TextView totalInsure;
    private TextView specifieDeduction;
    private TextView totalSpecifieDeduction;
    private TextView totalStartLevyPoint;
    private TextView lastMonthTotalIncome;
    private TextView lastMonthTotalInsure;
    private TextView lastMonthTotalDeduction;
    private TextView lastMonthTotalStartPoint;
    private TextView getTaxMoney;
    private TextView lastGetTaxMoney;
    private TextView totalTaxMoney;
    private TextView totalAlreadyTaxMoney;
    private TextView currentPersonalTax;
    private TextView afterTaxSalary;
    private CalResultData calResultData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calprocess);
        Bundle bundle=this.getIntent().getExtras();
        calResultData=(CalResultData) bundle.getParcelable("calculateData");
//        calResultData=(CalResultData) bundle.getSerializable("calculateData");
        currentMonth=findViewById(R.id.currentMonth);
        beforeTaxSalary=findViewById(R.id.beforeTaxSalary);
        totalBeforeTaxSalary=findViewById(R.id.totalBeforeTaxSalary);
        insure=findViewById(R.id.insure);
        totalInsure=findViewById(R.id.totalInsure);
        specifieDeduction=findViewById(R.id.specifieDeduction);
        totalSpecifieDeduction=findViewById(R.id.totalSpecifieDeduction);
        totalStartLevyPoint=findViewById(R.id.totalStartLevyPoint);
        lastMonthTotalIncome=findViewById(R.id.lastMonthTotalIncome);
        lastMonthTotalInsure = (TextView) findViewById(R.id.lastMonthTotalInsure);
        lastMonthTotalDeduction = (TextView) findViewById(R.id.lastMonthTotalDeduction);
        lastMonthTotalStartPoint = (TextView) findViewById(R.id.lastMonthTotalStartPoint);
        getTaxMoney = (TextView) findViewById(R.id.getTaxMoney);
        lastGetTaxMoney = (TextView) findViewById(R.id.lastGetTaxMoney);
        totalTaxMoney = (TextView) findViewById(R.id.totalTaxMoney);
        totalAlreadyTaxMoney = (TextView) findViewById(R.id.totalAlreadyTaxMoney);
        currentPersonalTax = (TextView) findViewById(R.id.currentPersonalTax);
        afterTaxSalary = (TextView) findViewById(R.id.afterTaxSalary);
        setData();
    }

    private void setData(){
        currentMonth.append(String.valueOf(calResultData.getMonthNumbers()));
        beforeTaxSalary.append(String.valueOf(calResultData.getBeforeTaxSalary0()));
        totalBeforeTaxSalary.append(String.valueOf(calResultData.getTotalBeforeTaxSalary0()));
        insure.append(String.valueOf(calResultData.getInsure0()));
        totalInsure.append(String.valueOf(calResultData.getTotalInsure0()));
        specifieDeduction.append(String.valueOf(calResultData.getSpecifieDeduction0()));
        totalSpecifieDeduction.append(String.valueOf(calResultData.getTotalSpecifieDeduction0()));
        totalStartLevyPoint.append(String.valueOf(calResultData.getTotalStartLevyPoint0()));
        lastMonthTotalIncome.append(String.valueOf(calResultData.getTotalBeforeTaxSalary0())+"-"+String.valueOf(calResultData.getBeforeTaxSalary0())+"="+ String.valueOf(calResultData.getLastMonthTotalBeforeTaxSalary()));
        lastMonthTotalInsure.append(String.valueOf(calResultData.getTotalInsure0())+"-"+String.valueOf(calResultData.getInsure0())+"="+ String.valueOf(calResultData.getLastMonthTotalInsure()));
        lastMonthTotalDeduction.append(String.valueOf(calResultData.getTotalSpecifieDeduction0())+"-"+String.valueOf(calResultData.getSpecifieDeduction0())+"="+ String.valueOf(calResultData.getLastMonthTotalSpecifieDeduction()));
        lastMonthTotalStartPoint.append(String.valueOf(calResultData.getTotalStartLevyPoint0())+"-"+String.valueOf(calResultData.getStartLevyPoint0())+"="+ String.valueOf(calResultData.getLastMonthTotalStartLevyPoint()));
        getTaxMoney.append(String.valueOf(calResultData.getTotalBeforeTaxSalary0())+"-"+String.valueOf(calResultData.getTotalInsure0())+"-"+String.valueOf(calResultData.getTotalSpecifieDeduction0())+"-"+String.valueOf(calResultData.getTotalStartLevyPoint0())+"="+String.valueOf(calResultData.getGetTaxMoney0()));
        lastGetTaxMoney.append(String.valueOf(calResultData.getLastMonthTotalBeforeTaxSalary())+"-"+String.valueOf(calResultData.getLastMonthTotalInsure())+"-"+String.valueOf(calResultData.getLastMonthTotalSpecifieDeduction())+"-"+String.valueOf(calResultData.getLastMonthTotalStartLevyPoint())+"="+ String.valueOf(calResultData.getLastMonthgetTaxMoney()));
        totalTaxMoney.append(String.valueOf(calResultData.getGetTaxMoney0())+"x"+String.valueOf(calResultData.getTaxRate1())+"-"+String.valueOf(calResultData.getQuickCalculateDigit0())+"="+String.valueOf(calResultData.getTotalTaxMoney0()));
        totalAlreadyTaxMoney.append(String.valueOf(calResultData.getLastMonthgetTaxMoney())+"x"+String.valueOf(calResultData.getTaxRate2())+"-"+String.valueOf(calResultData.getQuickCalculateDigit0())+"="+String.valueOf(calResultData.getTotalAlreadyTaxMoney0()));
        currentPersonalTax.append(String.valueOf(calResultData.getTotalTaxMoney0())+"-"+String.valueOf(calResultData.getTotalAlreadyTaxMoney0())+"="+String.valueOf(calResultData.getCurrentPersonalTax0()));
        afterTaxSalary.append(String.valueOf(calResultData.getBeforeTaxSalary0())+"-"+String.valueOf(calResultData.getInsure0())+"-"+String.valueOf(calResultData.getCurrentPersonalTax0())+"="+String.valueOf(calResultData.getAfterTaxSalary0()));
    }

    public void goBack(View view){
        Intent intent=new Intent();
        intent.setClass(CalProcessActivity.this,MainActivity.class);
        startActivity(intent);
    }

}
