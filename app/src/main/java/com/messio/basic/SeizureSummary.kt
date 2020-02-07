package com.messio.basic

import android.os.Parcel
import android.os.Parcelable

data class SeizureSummary(var strength: String): Parcelable {
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(strength)
    }

    override fun describeContents(): Int = hashCode()

    companion object CREATOR: Parcelable.Creator<SeizureSummary> {
        override fun createFromParcel(source: Parcel?): SeizureSummary = SeizureSummary(
            source?.readString() ?: ""
        )

        override fun newArray(size: Int): Array<SeizureSummary?> = arrayOfNulls(size)
    }
}