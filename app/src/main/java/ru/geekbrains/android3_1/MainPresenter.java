package ru.geekbrains.android3_1;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
  private CounterModel model;

  public MainPresenter() {
    this.model = new CounterModel();
  }

  public void onBtnOneClicked() {
    getViewState().onSetTextBtnOne(model.calculate(0));
  }

  public void onBtnTwoClicked() {
    getViewState().onSetTextBtnTwo(model.calculate(1));
  }

  public void onBtnThreeClicked() {
    getViewState().onSetTextBtnThree(model.calculate(2));
  }

  public void onBtnFourClicked() {
    getViewState().startTask1aActivity();
  }
}
