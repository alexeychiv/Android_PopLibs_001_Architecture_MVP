package gb.android.android_poplibs_001_architecture_mvp

import moxy.MvpPresenter


class MainPresenter(
    private val model: CountersModel
) : MvpPresenter<MainView>() {

    fun onCounter1Clicked() {
        viewState.setButton1Text(model.inc1().toString())
    }

    fun onCounter2Clicked() {
        viewState.setButton2Text(model.inc2().toString())
    }

    fun onCounter3Clicked() {
        viewState.setButton3Text(model.inc3().toString())
    }

}

