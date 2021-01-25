// Generated by view binder compiler. Do not edit!
package pe.com.bootcamp.encriptacionysesion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pe.com.bootcamp.encriptacionysesion.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button butEncriptar;

  @NonNull
  public final Button butIniciarSesion;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button butEncriptar,
      @NonNull Button butIniciarSesion) {
    this.rootView = rootView;
    this.butEncriptar = butEncriptar;
    this.butIniciarSesion = butIniciarSesion;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.butEncriptar;
      Button butEncriptar = rootView.findViewById(id);
      if (butEncriptar == null) {
        break missingId;
      }

      id = R.id.butIniciarSesion;
      Button butIniciarSesion = rootView.findViewById(id);
      if (butIniciarSesion == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, butEncriptar, butIniciarSesion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}