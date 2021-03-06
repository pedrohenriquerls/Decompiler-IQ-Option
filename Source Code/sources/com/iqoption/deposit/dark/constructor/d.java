package com.iqoption.deposit.dark.constructor;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import com.iqoption.core.microservices.billing.response.extraparams.c;
import com.iqoption.deposit.a.a;
import com.iqoption.deposit.constructor.e;
import kotlin.i;
import kotlin.jvm.internal.h;

@i(aXC = {1, 1, 11}, aXD = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, aXE = {"Lcom/iqoption/deposit/dark/constructor/SelectStringDarkFieldHolder;", "Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "binding", "Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldBinding;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "name", "", "isRequired", "", "(Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldBinding;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;Ljava/lang/String;Z)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldBinding;", "editText", "Landroid/support/design/widget/TextInputEditText;", "setHint", "", "hint", "showError", "message", "value", "view", "Landroid/view/View;", "deposit_release"})
/* compiled from: FieldHoldersDark.kt */
public final class d extends e {
    private final a bXT;

    public d(a aVar, c cVar, String str, boolean z) {
        h.e(aVar, "binding");
        h.e(cVar, "property");
        h.e(str, "name");
        super(cVar, str, z);
        this.bXT = aVar;
    }

    /* renamed from: abX */
    public c abT() {
        return abY();
    }

    public View abZ() {
        return this.bXT.getRoot();
    }

    public String value() {
        String value = getValue();
        return value != null ? value : "";
    }

    /* renamed from: acP */
    public TextInputEditText aca() {
        return this.bXT.bYt;
    }

    public void hg(String str) {
        TextInputLayout textInputLayout = this.bXT.bYu;
        h.d(textInputLayout, "binding.constructorSpinnerInput");
        textInputLayout.setHint(str);
    }

    public void hh(String str) {
        TextInputLayout textInputLayout = this.bXT.bYu;
        h.d(textInputLayout, "binding.constructorSpinnerInput");
        textInputLayout.setError(str);
        textInputLayout = this.bXT.bYu;
        h.d(textInputLayout, "binding.constructorSpinnerInput");
        textInputLayout.setErrorEnabled(str != null);
    }
}
