package com.geekbrains.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Android Views
     **/
    private TextView tv1;
    private Button btnCounter1;
    private TextView tv2;
    private Button btnCounter2;
    private TextView tv3;
    private Button btnCounter3;

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btnCounter1 = findViewById(R.id.btnCounter1);
        tv2 = findViewById(R.id.tv2);
        btnCounter2 = findViewById(R.id.btnCounter2);
        tv3 = findViewById(R.id.tv3);
        btnCounter3 = findViewById(R.id.btnCounter3);

        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);

        mPresenter = new Presenter();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCounter1:
                btnCounter1.setText(generateStr(0));
                break;
            case R.id.btnCounter2:
                btnCounter2.setText(generateStr(1));
                break;
            case R.id.btnCounter3:
                btnCounter3.setText(generateStr(2));
                break;
        }
    }

    private String generateStr(int index) {
        return getString(R.string.title_value_btn) + " " + mPresenter.buttonClick(index);
    }

}
