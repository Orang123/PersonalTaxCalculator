package com.example.personaltaxcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Spinner spinner;
    private EditText beforeTaxSalary;
    private EditText insure;
    private EditText specifieDeduction;
    private EditText startLevyPoint;
    private EditText totalBeforeTaxSalary;
    private EditText totalInsure;
    private EditText totalSpecifieDeduction;
    private EditText totalStartLevyPoint;
    private EditText []currentMonth=new EditText[4];
    private EditText []totalMonths=new EditText[4];
    private TextView getTaxMoney;
    private TextView taxRate;
    private TextView quickCalculateDigit;
    private TextView totalTaxMoney;
    private TextView totalAlreadyTaxMoney;
    private TextView currentPersonalTax;
    private TextView afterTaxSalary;
    private TextView []calculateResult=new TextView[7];
    private CalResultData calResultData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        beforeTaxSalary=findViewById(R.id.beforeTaxSalary);
        insure=findViewById(R.id.insure);
        specifieDeduction=findViewById(R.id.specifieDeduction);
        startLevyPoint=findViewById(R.id.startLevyPoint);
        currentMonth[0]=beforeTaxSalary;currentMonth[1]=insure;currentMonth[2]=specifieDeduction;currentMonth[3]=startLevyPoint;
        totalBeforeTaxSalary=findViewById(R.id.totalBeforeTaxSalary);
        totalInsure=findViewById(R.id.totalInsure);
        totalSpecifieDeduction=findViewById(R.id.totalSpecifieDeduction);
        totalStartLevyPoint=findViewById(R.id.totalStartLevyPoint);
        totalMonths[0]=totalBeforeTaxSalary;totalMonths[1]=totalInsure;totalMonths[2]=totalSpecifieDeduction;totalMonths[3]=totalStartLevyPoint;
        getTaxMoney=findViewById(R.id.getTaxMoney);
        taxRate=findViewById(R.id.taxRate);
        quickCalculateDigit=findViewById(R.id.quickCalculateDigit);
        totalTaxMoney=findViewById(R.id.totalTaxMoney);
        totalAlreadyTaxMoney=findViewById(R.id.totalAlreadyTaxMoney);
        currentPersonalTax=findViewById(R.id.currentPersonalTax);
        afterTaxSalary=findViewById(R.id.afterTaxSalary);
        calculateResult[0]=getTaxMoney;calculateResult[1]=taxRate;calculateResult[2]=quickCalculateDigit;calculateResult[3]=totalTaxMoney;
        calculateResult[4]=totalAlreadyTaxMoney;calculateResult[5]=currentPersonalTax;calculateResult[6]=afterTaxSalary;
        setListener();
        setStartLevyPoint();
    }

    private int monthNumbers;
    private void setListener(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                monthNumbers=Integer.parseInt(spinner.getSelectedItem().toString());
                for(int index=0;index<4;index++){
                    String result=currentMonth[index].getText().toString().trim();
                    result=deleteErrorChar(result);
                    if(result.equals(""))
                        result="0";
                    double value=Double.parseDouble(result);
                    totalMonths[index].setText(String.valueOf(value*monthNumbers));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        for(int i=0;i<4;i++){
            currentMonth[i].addTextChangedListener(new TextWatcher() {
                private int index;
                @Override
                public void afterTextChanged(Editable s) {
                    String result=currentMonth[index].getText().toString().trim();
                    result=deleteErrorChar(result);
                    if(result.equals(""))
                        result="0";
                    double value=Double.parseDouble(result);
                    int monthNumbers=Integer.parseInt(spinner.getSelectedItem().toString().trim());
                    totalMonths[index].setText(String.valueOf(value*monthNumbers));
                }

                public TextWatcher setIndex(int index){
                    this.index=index;
                    return this;
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

            }.setIndex(i));
        }
    }

    private void setStartLevyPoint(){
        startLevyPoint.setText("5000");
        startLevyPoint.setFocusable(false);
        startLevyPoint.setFocusableInTouchMode(false);
    }

    public void calculate(View view){
        calResultData=new CalResultData();
        calResultData.setMonthNumbers(monthNumbers);
        double beforeTaxSalary0=Double.parseDouble(beforeTaxSalary.getText().toString().trim());
        calResultData.setBeforeTaxSalary0(beforeTaxSalary0);
        double insure0=Double.parseDouble(insure.getText().toString().trim());
        calResultData.setInsure0(insure0);
        double specifieDeduction0=Double.parseDouble(specifieDeduction.getText().toString().trim());
        calResultData.setSpecifieDeduction0(specifieDeduction0);
        double startLevyPoint0=Double.parseDouble(startLevyPoint.getText().toString().trim());
        calResultData.setStartLevyPoint0(startLevyPoint0);
        double totalBeforeTaxSalary0=Double.parseDouble(totalBeforeTaxSalary.getText().toString().trim());
        calResultData.setTotalBeforeTaxSalary0(totalBeforeTaxSalary0);
        double totalInsure0=Double.parseDouble(totalInsure.getText().toString().trim());
        calResultData.setTotalInsure0(totalInsure0);
        double totalSpecifieDeduction0=Double.parseDouble(totalSpecifieDeduction.getText().toString().trim());
        calResultData.setTotalSpecifieDeduction0(totalSpecifieDeduction0);
        double totalStartLevyPoint0=Double.parseDouble(totalStartLevyPoint.getText().toString().trim());
        calResultData.setTotalStartLevyPoint0(totalStartLevyPoint0);
        double lastMonthTotalBeforeTaxSalary=totalBeforeTaxSalary0-beforeTaxSalary0;
        calResultData.setLastMonthTotalBeforeTaxSalary(lastMonthTotalBeforeTaxSalary);
        double lastMonthTotalInsure=totalInsure0-insure0;
        calResultData.setLastMonthTotalInsure(lastMonthTotalInsure);
        double lastMonthTotalSpecifieDeduction=totalSpecifieDeduction0-specifieDeduction0;
        calResultData.setLastMonthTotalSpecifieDeduction(lastMonthTotalSpecifieDeduction);
        double lastMonthTotalStartLevyPoint=totalStartLevyPoint0-startLevyPoint0;
        calResultData.setLastMonthTotalStartLevyPoint(lastMonthTotalStartLevyPoint);
        double getTaxMoney0=totalBeforeTaxSalary0-totalInsure0-totalSpecifieDeduction0-totalStartLevyPoint0;
        if(getTaxMoney0>0){
            calResultData.setGetTaxMoney0(getTaxMoney0);
            getTaxMoney.setText(String.valueOf(roundDouble(getTaxMoney0)));
            double lastMonthgetTaxMoney=lastMonthTotalBeforeTaxSalary-lastMonthTotalInsure-lastMonthTotalSpecifieDeduction-lastMonthTotalStartLevyPoint;
            calResultData.setLastMonthgetTaxMoney(lastMonthgetTaxMoney);
            double []result;
            result=calculateTaxRate(getTaxMoney0);
            double totalTaxMoney0=roundDouble(result[0]);
            calResultData.setTotalTaxMoney0(totalTaxMoney0);
            totalTaxMoney.setText(String.valueOf(totalTaxMoney0));
            double taxRate1=result[1];
            calResultData.setTaxRate1(taxRate1);
            taxRate.setText(String.valueOf(result[1]*100));
            result=calculateTaxRate(lastMonthgetTaxMoney);
            double taxRate2=result[1];
            calResultData.setTaxRate2(taxRate2);
            double totalAlreadyTaxMoney0=roundDouble(result[0]);
            calResultData.setTotalAlreadyTaxMoney0(totalAlreadyTaxMoney0);
            totalAlreadyTaxMoney.setText(String.valueOf(totalAlreadyTaxMoney0));
            double quickCalculateDigit0=result[2];
            calResultData.setQuickCalculateDigit0(quickCalculateDigit0);
            quickCalculateDigit.setText(String.valueOf(quickCalculateDigit0));
            double currentPersonalTax0,afterTaxSalary0;
            currentPersonalTax0=totalTaxMoney0-totalAlreadyTaxMoney0;
            calResultData.setCurrentPersonalTax0(currentPersonalTax0);
            currentPersonalTax.setText(String.valueOf(currentPersonalTax0));
            afterTaxSalary0=beforeTaxSalary0-insure0-currentPersonalTax0;
            calResultData.setAfterTaxSalary0(afterTaxSalary0);
            afterTaxSalary.setText(String.valueOf(afterTaxSalary0));
        }
        else{
            Toast.makeText(this,"未达到起征点，请重新输入数据",Toast.LENGTH_SHORT).show();
            calResultData=null;
        }
    }

    private double [] calculateTaxRate(double payRate){
        double []result=new double[3];
        if(payRate<=36000){
            result[0]=payRate*0.03-0;
            result[1]=0.03;
            result[2]=0;
        }
        else if(payRate<=144000){
            result[0]=payRate*0.1-2520;
            result[1]=0.1;
            result[2]=2520;
        }
        else if(payRate<=300000){
            result[0]=payRate*0.2-16920;
            result[1]=0.2;
            result[2]=16920;
        }
        else if(payRate<=420000){
            result[0]=payRate*0.25-31920;
            result[1]=0.25;
            result[2]=31920;
        }
        else if(payRate<=660000){
            result[0]=payRate*0.3-52920;
            result[1]=0.3;
            result[2]=52920;
        }
        else if(payRate<=960000){
            result[0]=payRate*0.35-85920;
            result[1]=0.35;
            result[2]=85920;
        }
        else{
            result[0]=payRate*0.45-181920;
            result[1]=0.45;
            result[2]=181920;
        }
        return result;
    }

    public static Double roundDouble(double val) {
        Double ret = null;
        try {
            double factor = Math.pow(10, 2);
            ret = Math.floor(val * factor + 0.5) / factor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public void reset(View view){
        spinner.setSelection(0,true);
        for(int i=0;i<4;i++){
            currentMonth[i].setText(null);
            totalMonths[i].setText(null);
        }
        for(int i=0;i<7;i++)
            calculateResult[i].setText(null);
        calResultData=null;
    }

    private  String deleteErrorChar(String res){
        for(int i=0;i<res.length();i++){
            char tmp=res.charAt(i);
            if((tmp<'0'&&tmp!='.')||tmp>'9'){
                res=res.substring(0,i)+res.substring(i+1);
                i--;
                Toast.makeText(this,"请输入0-9的数字或小数点",Toast.LENGTH_SHORT).show();
            }
        }
        return res;
    }

    public void displayCalculatorProcess(View view){
        if(calResultData!=null){
            Bundle bundle=new Bundle();
            bundle.putParcelable("calculateData",calResultData);
//            bundle.putSerializable("calculateData",calResultData);
            Intent intent=new Intent();
            intent.putExtras(bundle);
            intent.setClass(MainActivity.this,CalProcessActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(this,"请先计算出结果数据",Toast.LENGTH_SHORT).show();
    }

}
