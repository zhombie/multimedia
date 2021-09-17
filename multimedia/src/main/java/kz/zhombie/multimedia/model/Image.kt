package kz.zhombie.multimedia.model

import android.net.Uri

data class Image constructor(
    override val id: Long,
    override val uri: Uri,
    override val title: String?,
    override val displayName: String,
    override val folder: Folder?,
    override val history: History?,
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
), Media.Visual {

    constructor(
        uri: Uri,
        displayName: String
    ) : this(
        id = generateId(),
        uri = uri,
        title = null,
        displayName = displayName,
        folder = null,
        history = null,
        resolution = null,
        localFile = null
    )

    constructor(
        uri: Uri,
        title: String,
        displayName: String,
        localFile: LocalFile,
        history: History
    ) : this(
        id = generateId(),
        uri = uri,
        title = title,
        displayName = displayName,
        folder = null,
        history = history,
        resolution = null,
        localFile = localFile
    )

}