package demo.drawable.ripple;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	private TextView mTvSystem;
	private TextView mTvCustom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTvSystem = findViewById(R.id.tv_system);
		mTvCustom = findViewById(R.id.tv_custom);

		mTvSystem.setOnClickListener(v -> {/**/});

		mTvCustom.setOnClickListener(v -> {/**/});
		mTvCustom.setBackground(new CustomRippleDrawable());
	}
}
