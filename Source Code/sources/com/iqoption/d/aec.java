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
import com.iqoption.x.R;

/* compiled from: PortfolioCfdItemBinding */
public abstract class aec extends ViewDataBinding {
    @NonNull
    public final TextView agA;
    @NonNull
    public final TextView agQ;
    @NonNull
    public final ImageView bLK;
    @NonNull
    public final ConstraintLayout bLL;
    @NonNull
    public final FrameLayout bLN;
    @NonNull
    public final aea bPx;
    @NonNull
    public final TextView bnA;
    @NonNull
    public final TextView bns;
    @NonNull
    public final ImageView brA;

    protected aec(DataBindingComponent dataBindingComponent, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, aea aea, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView2, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, i);
        this.bLK = imageView;
        this.bLL = constraintLayout;
        this.bPx = aea;
        setContainedBinding(this.bPx);
        this.bnA = textView;
        this.agQ = textView2;
        this.bLN = frameLayout;
        this.brA = imageView2;
        this.agA = textView3;
        this.bns = textView4;
    }

    @NonNull
    public static aec al(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return al(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static aec al(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (aec) DataBindingUtil.inflate(layoutInflater, R.layout.portfolio_cfd_item, viewGroup, z, dataBindingComponent);
    }
}
