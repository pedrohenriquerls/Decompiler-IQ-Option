package android.databinding.adapters;

import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.widget.AbsSeekBar;

@BindingMethods({@BindingMethod(attribute = "android:thumbTint", method = "setThumbTintList", type = AbsSeekBar.class)})
@RestrictTo({Scope.LIBRARY})
public class AbsSeekBarBindingAdapter {
}