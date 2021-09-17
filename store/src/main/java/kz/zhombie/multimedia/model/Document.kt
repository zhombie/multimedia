package kz.zhombie.multimedia.model

import android.net.Uri

data class Document constructor(
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
)