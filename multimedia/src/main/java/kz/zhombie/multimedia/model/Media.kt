package kz.zhombie.multimedia.model

import android.net.Uri

open class Media internal constructor(
    override val id: Long,
    override val uri: Uri,
    override val title: String?,
    override val displayName: String,
    override val folder: Folder?,
    override val history: History?,
    override val localFile: LocalFile?
) : Content(
    id = id,
    uri = uri,
    title = title,
    displayName = displayName,
    folder = folder,
    history = history,
    localFile = localFile
) {

    interface Playable {
        companion object {
            const val UNDEFINED = -1L
        }

        /**
         * [duration] - The duration time of the [Media]
         */
        val duration: Long

        fun hasUndefinedDuration(): Boolean {
            return duration == UNDEFINED
        }
    }

    interface Visual {
        val resolution: Resolution?
    }

    override fun toString(): String {
        return "${Media::class.java.simpleName}(id=$id, uri=$uri, title=$title, displayName=$displayName, folder=$folder, history=$history, localFile=$localFile)"
    }

}