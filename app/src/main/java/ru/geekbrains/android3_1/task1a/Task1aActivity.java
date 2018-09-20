package ru.geekbrains.android3_1.task1a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jakewharton.rxbinding.widget.RxTextView;
import ru.geekbrains.android3_1.R;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Task1aActivity extends AppCompatActivity {

  @BindView(R.id.task1a_edit_text) EditText editText;
  @BindView(R.id.task1a_text_view) TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_task1a);
    ButterKnife.bind(this);
  }

  Subscription editTextSub = RxTextView
      .textChanges(editText)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .subscribe(charSequence -> {
        // do something
      });
}
