package gb.android.android_poplibs_001_architecture_mvp

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

//@AddToEndSingle
interface MainView : MvpView {

    @AddToEndSingle fun setButton1Text(text: String)
    @AddToEndSingle fun setButton2Text(text: String)
    @AddToEndSingle fun setButton3Text(text: String)

}

