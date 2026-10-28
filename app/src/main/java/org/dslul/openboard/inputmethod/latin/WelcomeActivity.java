package org.dslul.openboard.inputmethod.latin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class WelcomeActivity extends Activity {
  @Override
  protected void onCreate(Bundle b) {
    super.onCreate(b);
    FrameLayout root = new FrameLayout(this);

    ImageView iv = new ImageView(this);
    iv.setImageResource(R.drawable.my_photo);
    iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
    root.addView(iv);

    Button btn = new Button(this);
    btn.setText("فعّل الكيبورد");
    btn.setTextColor(Color.WHITE);
    btn.setBackgroundColor(0xCC000000);
    btn.setOnClickListener(v -> startActivity(
      new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)));
    FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
      FrameLayout.LayoutParams.MATCH_PARENT,
      FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM);
    lp.setMargins(60, 0, 60, 120);
    root.addView(btn, lp);

    setContentView(root);
  }
}
