package com.srivatsa.mergeadapter

import com.srivatsa.mergeadapter.model.Banner
import com.srivatsa.mergeadapter.model.User

object DataSource {
    fun getUser()=ArrayList<User>().apply {
        add(
            User(
                1,
                "Srivatsa",
                "https://twitter.com/srivatsa224/photo"
            )
        )
        add(
            User(
                2,
                "Richard",
                "https://s3.amazonaws.com/uifaces/faces/twitter/johnsmithagency/128.jpg"
            )
        )
        add(
            User(
                3,
                "Gilfoyle",
                "s3.amazonaws.com/uifaces/faces/twitter/allfordesign/128.jpg"
            )
        )
        add(
            User(
                4,
                "Dinesh",
                "s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"
            )
        )
        add(
            User(
                5,
                "Erlic",
                "https://s3.amazonaws.com/uifaces/faces/twitter/shaneIxD/128.jpg"
            )
        )
        add(
            User(
                6,
                "Jin Yang",
                "https://s3.amazonaws.com/uifaces/faces/twitter/alxndrustinov/128.jpg"
            )
        )

    }
    fun getBanner()=
        Banner(R.drawable.piper)
}