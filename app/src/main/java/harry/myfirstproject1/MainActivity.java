package harry.myfirstproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    TextView tv;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        Button bt = (Button) findViewById(R.id.bt_add);
        Button bt_sub = (Button) findViewById(R.id.bt_sub);
        Button bt_mul = (Button) findViewById(R.id.bt_mul);
        bt.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      i = i + 1;
                                      tv.setText("" + i);
                                      calculate(1);
                                  }
                              });


            bt_sub.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                i--;
                tv.setText("" + i);
                calculate(2);
            }
                });


                bt_mul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i=i*1;
                        tv.setText("" + i);
                        calculate(3);
                    }

        });

    }

    private void calculate(int i) {
        int a, b;
        if (et1.getText().toString().trim() != null) {
            if (et2.getText().toString().trim() != null) {

                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());

                if (i == 1) {
                    tv.setText("" + (a + b));
                } else if (i == 2) {
                    tv.setText("" + (a - b));
                } else {
                    tv.setText("" + (a * b));

                }
            }
        }
    }
        }