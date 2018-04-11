package edu.ntut.user.myhw3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private Spinner  mSpnSex;
    private RadioGroup mRadGrp;
    private RadioButton mRadBtnAgeRange1;
    private RadioButton mRadBtnAgeRange2;
    private Button mBtnOK;
    private TextView mTxtSug;
    private TextView mTxthob;
    //private String selectedSex;
    private CheckBox mcheBox1;
    private CheckBox mcheBox2;
    private CheckBox mcheBox3;
    private CheckBox mcheBox4;
    private CheckBox mcheBox5;
    private CheckBox mcheBox6;
    private CheckBox mcheBox7;
    private CheckBox mcheBox8;
    private CheckBox mcheBox9;
    private CheckBox mcheBox10;
    private String msSex;

    String strspn = "cool";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpnSex = (Spinner) findViewById(R.id.spinner);
        mRadGrp = (RadioGroup) findViewById(R.id.radGrpSex);
        mRadBtnAgeRange1 = (RadioButton) findViewById(R.id.radioButton_male);
        mRadBtnAgeRange2 = (RadioButton) findViewById(R.id.radioButton_female);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        mTxtSug = (TextView) findViewById(R.id.txtSug);
        mTxthob = (TextView) findViewById(R.id.textHob);
        mcheBox1= (CheckBox) findViewById(R.id.che_music);
        mcheBox2= (CheckBox) findViewById(R.id.che_singing);
        mcheBox3= (CheckBox) findViewById(R.id.che_dancing);
        mcheBox4= (CheckBox) findViewById(R.id.che_travel);
        mcheBox5= (CheckBox) findViewById(R.id.che_reading);
        mcheBox6= (CheckBox) findViewById(R.id.che_writing);
        mcheBox7= (CheckBox) findViewById(R.id.che_climbing);
        mcheBox8= (CheckBox) findViewById(R.id.che_swimming);
        mcheBox9= (CheckBox) findViewById(R.id.che_food);
        mcheBox10= (CheckBox) findViewById(R.id.che_painting);

        //mSpnSex.setOnItemSelectedListener(spnOnItemSelect);
        //mNumPkrFamily.setOnValueChangedListener(numPkrFamilyOnValueChange);
        mBtnOK.setOnClickListener(btnOKOnClick);
        final Spinner spinner_male = (Spinner) findViewById(R.id.spinner);
        spinner_male.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strspn= adapterView.getItemAtPosition(i).toString();
                //mTxtSug.setText("23");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            MarriageSuggestion ms = new MarriageSuggestion();


            String strspnfemale = mSpnSex.getSelectedItem().toString();
            final Spinner spinner_male = (Spinner) findViewById(R.id.spinner);
            String strSug = "建議：";
            String strhob = "興趣：";
            String a="(男)小於30歲";
            int iAgeRange = 0;

            switch (mRadGrp.getCheckedRadioButtonId()) {
                case R.id.radioButton_male:
                    if(strspn.equals("(男)小於30歲") ){
                        strSug+="還不急";
                    }
                    else if(strspn.equals("(男)30~40歲")){
                        strSug+="開始找對象";
                    }
                    else if(strspn.equals("(男)大於40歲")){
                        strSug+="趕快結婚";
                    }
                    break;
                case R.id.radioButton_female:
                    if(strspn.equals("(女)小於28歲")){
                        strSug+="開始找對象";
                    }
                    else if(strspn.equals("(女)28~35歲")){
                        strSug+="趕快結婚";
                    }
                    else if(strspn.equals("(女)大於35歲")){
                        strSug+="趕快結婚";
                    }
                    break;
            }
            mTxtSug.setText(strSug);
            if(mcheBox1.isChecked()){
                strhob+=mcheBox1.getText()+" ";
            }
            if(mcheBox2.isChecked()){
                strhob+=mcheBox2.getText()+" ";
            }
            if(mcheBox3.isChecked()){
                strhob+=mcheBox3.getText()+" ";
            }
            if(mcheBox4.isChecked()){
                strhob+=mcheBox4.getText()+" ";
            }
            if(mcheBox5.isChecked()){
                strhob+=mcheBox5.getText()+" ";
            }
            if(mcheBox6.isChecked()){
                strhob+=mcheBox6.getText()+" ";
            }
            if(mcheBox7.isChecked()){
                strhob+=mcheBox7.getText()+" ";
            }
            if(mcheBox8.isChecked()){
                strhob+=mcheBox8.getText()+" ";
            }
            if(mcheBox9.isChecked()){
                strhob+=mcheBox1.getText()+" ";
            }
            if(mcheBox10.isChecked()){
                strhob+=mcheBox10.getText()+" ";
            }
            mTxthob.setText(strhob);
        }
    };
}
