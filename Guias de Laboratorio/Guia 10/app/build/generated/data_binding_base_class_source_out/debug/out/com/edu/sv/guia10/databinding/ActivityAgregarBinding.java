// Generated by view binder compiler. Do not edit!
package com.edu.sv.guia10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.edu.sv.guia10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAgregarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtCodigo;

  @NonNull
  public final EditText edtDescripcion;

  @NonNull
  public final EditText edtPrecio;

  private ActivityAgregarBinding(@NonNull LinearLayout rootView, @NonNull EditText edtCodigo,
      @NonNull EditText edtDescripcion, @NonNull EditText edtPrecio) {
    this.rootView = rootView;
    this.edtCodigo = edtCodigo;
    this.edtDescripcion = edtDescripcion;
    this.edtPrecio = edtPrecio;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAgregarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAgregarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_agregar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAgregarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtCodigo;
      EditText edtCodigo = rootView.findViewById(id);
      if (edtCodigo == null) {
        break missingId;
      }

      id = R.id.edtDescripcion;
      EditText edtDescripcion = rootView.findViewById(id);
      if (edtDescripcion == null) {
        break missingId;
      }

      id = R.id.edtPrecio;
      EditText edtPrecio = rootView.findViewById(id);
      if (edtPrecio == null) {
        break missingId;
      }

      return new ActivityAgregarBinding((LinearLayout) rootView, edtCodigo, edtDescripcion,
          edtPrecio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
