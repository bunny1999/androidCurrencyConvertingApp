package in.irotech.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro,dollor,pound,yen,dinar,bitcoin,rubel,ausdoller,candoller;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        euro=findViewById(R.id.euro);
        dollor=findViewById(R.id.dollor);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausdoller=findViewById(R.id.ausDoller);
        candoller=findViewById(R.id.candianDoller);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.012;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("€"+decimalFormat.format(k));
                }

            }
        });

        dollor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.014;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("$"+decimalFormat.format(k));
                }

            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.011;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("£"+decimalFormat.format(k));
                }

            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*1.47;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("¥"+decimalFormat.format(k));
                }

            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.0042;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(".د.م"+decimalFormat.format(k));
                }

            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.0000016;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("BTC"+decimalFormat.format(k));
                }

            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.90;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("\u20BD"+decimalFormat.format(k));
                }

            }
        });


        ausdoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.021;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("AUS$"+decimalFormat.format(k));
                }

            }
        });

        candoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=editText.getText().toString();
                textView.setText(null);

                if(TextUtils.isEmpty(val)){
                    editText.setError("Enter Some Value");
                }else{
                    double n,k;

                    n=Double.parseDouble(val);
                    Formatter formatter=new Formatter();
                    k=n*0.018;
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText("CAN$"+decimalFormat.format(k));
                }

            }
        });
    }
}
