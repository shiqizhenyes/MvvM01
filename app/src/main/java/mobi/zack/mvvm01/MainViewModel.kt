package mobi.zack.mvvm01

import android.arch.lifecycle.ViewModel
import android.util.Log
import android.view.View

class MainViewModel : ViewModel() {

    var person: Person = Person()

    fun onLike() {
        person.like.set(person.like.get() + 1)
        Log.d("点击了", "zack" + person.like)
    }

}
