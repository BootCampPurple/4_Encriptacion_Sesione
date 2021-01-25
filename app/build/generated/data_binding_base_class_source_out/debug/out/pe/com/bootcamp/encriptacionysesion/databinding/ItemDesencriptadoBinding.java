// Generated by view binder compiler. Do not edit!
package pe.com.bootcamp.encriptacionysesion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pe.com.bootcamp.encriptacionysesion.R;

public final class ItemDesencriptadoBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tviDesencriptado;

  @NonNull
  public final TextView tviEncriptado;

  private ItemDesencriptadoBinding(@NonNull CardView rootView, @NonNull TextView tviDesencriptado,
      @NonNull TextView tviEncriptado) {
    this.rootView = rootView;
    this.tviDesencriptado = tviDesencriptado;
    this.tviEncriptado = tviEncriptado;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDesencriptadoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDesencriptadoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_desencriptado, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDesencriptadoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tviDesencriptado;
      TextView tviDesencriptado = rootView.findViewById(id);
      if (tviDesencriptado == null) {
        break missingId;
      }

      id = R.id.tviEncriptado;
      TextView tviEncriptado = rootView.findViewById(id);
      if (tviEncriptado == null) {
        break missingId;
      }

      return new ItemDesencriptadoBinding((CardView) rootView, tviDesencriptado, tviEncriptado);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
