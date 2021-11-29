package gb.android.android_poplibs_001_architecture_mvp

import android.os.Bundle
import gb.android.android_poplibs_001_architecture_mvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


class MainActivity : MvpAppCompatActivity(), MainView {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!


    //private val presenter = MainPresenter()

    //@InjectPresenter
    //lateinit var presenter: MainPresenter
    //
    //@ProvidePresenter
    //fun providePresenter(): MainPresenter {
    //  return MainPresenter(CountersModel())
    //}
    //same as above
    private val presenter by moxyPresenter { MainPresenter(CountersModel()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initButtonListeners()
    }

    private fun initButtonListeners() {
        binding.btnCounter1.setOnClickListener {
            presenter.onCounter1Clicked()
        }
        binding.btnCounter2.setOnClickListener {
            presenter.onCounter2Clicked()
        }
        binding.btnCounter3.setOnClickListener {
            presenter.onCounter3Clicked()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun setButton1Text(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButton2Text(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButton3Text(text: String) {
        binding.btnCounter3.text = text
    }

}