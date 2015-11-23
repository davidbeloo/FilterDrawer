package com.thepinkandroid.filterdrawer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.thepinkandroid.filterdrawer.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button mWithNavigationBtn;
    private Button mWithoutNavigationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
    }

    private void setViews()
    {
        mWithNavigationBtn = (Button) findViewById(R.id.withNavigationBtn);
        mWithoutNavigationBtn = (Button) findViewById(R.id.withoutNavigationBtn);

        mWithNavigationBtn.setOnClickListener(this);
        mWithoutNavigationBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = null;
        switch (v.getId())
        {
            case R.id.withNavigationBtn:
                intent = new Intent(this, NavigationViewActivity.class);
                break;
            case R.id.withoutNavigationBtn:
                intent = new Intent(this, noNavigationViewActivity.class);
                break;
        }
        startActivity(intent);
    }
}
