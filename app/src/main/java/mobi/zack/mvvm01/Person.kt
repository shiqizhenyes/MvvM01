package mobi.zack.mvvm01

import android.databinding.ObservableInt

class Person {

    var name: String = ""
    var lastName : String = ""
    var like = ObservableInt()

    var age = 0


    override fun toString(): String {
        return "Person(name=$name, lastName=$lastName, age=$age)"
    }

}
