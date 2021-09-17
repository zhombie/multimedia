package kz.zhombie.multimedia

import android.database.Cursor

fun Cursor.getInt(columnName: String): Int {
    return getInt(getColumnIndex(columnName))
}

fun Cursor.getLong(columnName: String): Long {
    return getLong(getColumnIndex(columnName))
}

fun Cursor.getFloat(columnName: String): Float {
    return getFloat(getColumnIndex(columnName))
}

fun Cursor.getDouble(columnName: String): Double {
    return getDouble(getColumnIndex(columnName))
}

fun Cursor.getString(columnName: String): String? {
    return getString(getColumnIndex(columnName))
}