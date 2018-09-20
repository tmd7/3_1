package ru.geekbrains.android3_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import java.util.Locale;
import ru.geekbrains.android3_1.task1a.Task1aActivity;

public class MainActivity extends MvpAppCompatActivity implements MainView {
  @BindView(R.id.btn_one)   Button buttonOne;
  @BindView(R.id.btn_two)   Button buttonTwo;
  @BindView(R.id.btn_three) Button buttonThree;
  @BindView(R.id.btn_four) Button buttonFout;

  @InjectPresenter MainPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @ProvidePresenter
  public MainPresenter provideMainPresenter() {
    presenter = new MainPresenter();
    //TO SOMETHING WITH PRESENTER
    return presenter;
  }

  @OnClick({ R.id.btn_one, R.id.btn_two, R.id.btn_three, R.id.btn_four })
  public void onClick(Button button) {
    //presenter.counterClick(button.getId());

    switch (button.getId()) {
      case R.id.btn_one:
        presenter.onBtnOneClicked();
        break;
      case R.id.btn_two:
        presenter.onBtnTwoClicked();
        break;
      case R.id.btn_three:
        presenter.onBtnThreeClicked();
        break;
      case R.id.btn_four:
        presenter.onBtnFourClicked();
    }
  }

  @Override
  public void onSetTextBtnOne(Integer val) {
    buttonOne.setText(String.format(Locale.getDefault(), "%d", val));
  }

  @Override
  public void onSetTextBtnTwo(Integer val) {
    buttonTwo.setText(String.format(Locale.getDefault(), "%d", val));
  }

  @Override
  public void onSetTextBtnThree(Integer val) {
    buttonThree.setText(String.format(Locale.getDefault(), "%d", val));
  }

  @Override public void startTask1aActivity() {
    Intent intent =new Intent(this, Task1aActivity.class);
    startActivity(intent);
  }
}
