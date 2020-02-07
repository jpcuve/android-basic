package com.messio.basic

import android.os.Parcel
import android.os.Parcelable

data class SeizureSummary(var multiple: Boolean? = null, var strength: String? = null) :
    Parcelable {
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(multiple?.let { multiple.toString() })
        dest?.writeString(strength)
    }

    override fun describeContents(): Int = hashCode()

    companion object CREATOR : Parcelable.Creator<SeizureSummary> {
        override fun createFromParcel(source: Parcel?): SeizureSummary = SeizureSummary(
            source?.readString()?.toBoolean(),
            source?.readString()
        )

        override fun newArray(size: Int): Array<SeizureSummary?> = Array(size) { SeizureSummary() }
    }
}