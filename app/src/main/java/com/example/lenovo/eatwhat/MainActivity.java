package com.example.lenovo.eatwhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView eatwhat;
    private Button eat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        eatwhat = (TextView) findViewById(R.id.textView2);
        eat = (Button) findViewById(R.id.button);

        eat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String food[] = {"铁锅焖面",
                         "一楼盖饭",
                         "羊肉泡馍",
                         "麻辣烫",
                         "包子",
                         "香菇鸡丁汤面",
                         "拉面",
                         "奶茶",
                         "饺子",
                         "不吃"};
        int num = (int)(Math.random()*food.length);
        eatwhat.setText(food[num]);
    }
}
