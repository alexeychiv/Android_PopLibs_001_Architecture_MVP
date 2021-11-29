package gb.android.android_poplibs_001_architecture_mvp


class MainPresenter(
    val view: MainView
) {

    private val model = CountersModel()

    fun onCounter1Clicked() {
        view.setButton1Text(model.inc1().toString())
    }

    fun onCounter2Clicked() {
        view.setButton2Text(model.inc2().toString())
    }

    fun onCounter3Clicked() {
        view.setButton3Text(model.inc3().toString())
    }

}

