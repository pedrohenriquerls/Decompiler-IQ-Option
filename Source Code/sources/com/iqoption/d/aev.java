package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;

/* compiled from: PortfolioExpSingleGroupItemBinding */
public abstract class aev extends ViewDataBinding {
    @NonNull
    public final TextView agA;
    @NonNull
    public final TextView agQ;
    @NonNull
    public final ConstraintLayout bLL;
    @NonNull
    public final FrameLayout bLN;
    @NonNull
    public final aer bPO;
    @NonNull
    public final TimerView blb;
    @NonNull
    public final TextView bnN;
    @NonNull
    public final TextView bns;
    @NonNull
    public final ImageView brA;

    protected aev(DataBindingComponent dataBindingComponent, View view, int i, ConstraintLayout constraintLayout, aer aer, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView, TimerView timerView, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, i);
        this.bLL = constraintLayout;
        this.bPO = aer;
        setContainedBinding(this.bPO);
        this.bnN = textView;
        this.agQ = textView2;
        this.bLN = frameLayout;
        this.brA = imageView;
        this.blb = timerView;
        this.agA = textView3;
        this.bns = textView4;
    }

    @NonNull
    public static aev aq(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return aq(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static aev aq(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (aev) DataBindingUtil.inflate(layoutInflater, R.layout.portfolio_exp_single_group_item, viewGroup, z, dataBindingComponent);
    }
}
