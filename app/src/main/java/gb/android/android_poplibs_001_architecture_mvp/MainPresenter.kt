package gb.android.android_poplibs_001_architecture_mvp


class MainPresenter(
    val view: MainView
) {

    private val model = CountersModel()

    fun counterClick(index: Int) {
        when (index) {
            0 -> view.setButton1Text(model.inc(0).toString())
            1 -> view.setButton2Text(model.inc(1).toString())
            2 -> view.setButton3Text(model.inc(2).toString())
        }
    }

}

