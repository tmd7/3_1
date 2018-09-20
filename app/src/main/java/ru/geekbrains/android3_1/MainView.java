package ru.geekbrains.android3_1;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)

public interface MainView extends MvpView {

  void onSetTextBtnOne(Integer val);

  void onSetTextBtnTwo(Integer val);

  void onSetTextBtnThree(Integer val);

  void startTask1aActivity();
}
