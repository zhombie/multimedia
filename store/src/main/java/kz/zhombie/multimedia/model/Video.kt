package kz.zhombie.multimedia.model

import android.net.Uri

data class Video constructor(
    override val id: Long,
    override val uri: Uri,
    override val title: String?,
    override val displayName: String,
    override val folder: Folder?,
    override val history: History?,
    override val duration: Long,
    override val resolution: Resolution?,
    override val localFile: LocalFile?
) : Media(
    id = id,
    uri = uri,
    title = title,
    displayName = displayName,
    folder = folder,
    history = history,
    localFile = localFile
), Media.Playable, Media.Visual {

    constructor(
        uri: Uri,
        displayName: String,
        localFile: LocalFile
    ) : this(
        id = generateId(),
        uri = uri,
        title = null,
        displayName = displayName,
        folder = null,
        history = null,
        duration = Playable.UNDEFINED,
        resolution = null,
        localFile = localFile
    )

}