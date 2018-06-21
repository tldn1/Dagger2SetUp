package com.tldn1.dagger2setup.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tldn1.dagger2setup.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    SayHiToGithub sayHiToGithub;

    @BindView(R.id.displayHi)
    TextView displayHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        displayHi.setText(sayHiToGithub.hi());

    }
}
