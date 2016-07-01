package com.example.houshuai.copy360antivirus.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by HouShuai on 2016/7/1.
 */

public abstract class BaseActivty  extends AppCompatActivity{

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivity());
        bind = ButterKnife.bind(this);
        initView();
    }
    /*获取Activity的界面ID*/
    protected abstract int getActivity();
    /*初始化布局等Ui操作*/
    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
