package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioExpHeaderItemBinding */
public abstract class zw extends ViewDataBinding {
    @NonNull
    public final TextView bLO;

    protected zw(DataBindingComponent dataBindingComponent, View view, int i, TextView textView) {
        super(dataBindingComponent, view, i);
        this.bLO = textView;
    }

    @NonNull
    public static zw V(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return V(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static zw V(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (zw) DataBindingUtil.inflate(layoutInflater, R.layout.micro_portfolio_exp_header_item, viewGroup, z, dataBindingComponent);
    }
}
