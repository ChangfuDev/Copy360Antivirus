package com.example.houshuai.copy360antivirus.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by HouShuai on 2016/7/1.
 */

public abstract class BaseFragment extends Fragment {
    public Context mContent;
    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentID(), container, false);
        bind = ButterKnife.bind(this, view);
        return view;
    }

    /*fragment的id*/
    protected abstract int getFragmentID();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContent = context;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initLayout();
    }

    /*UI的响应操作*/
    protected abstract void initLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();
    }
}
