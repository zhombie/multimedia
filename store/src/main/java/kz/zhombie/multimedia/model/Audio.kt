package kz.zhombie.multimedia.model

import android.net.Uri

data class Audio constructor(
    override val id: Long,
    override val uri: Uri,
    override val title: String?,
    override val displayName: String,
    override val folder: Folder?,
    override val history: History?,
    override val duration: Long,
    val album: Album?,
    override val localFile: LocalFile?
) : Media(
    id = id,
    uri = uri,
    title = title,
    displayName = displayName,
    folder = folder,
    history = history,
    localFile = localFile,
), Media.Playable {

    data class Album constructor(
        val id: Long,
        val title: String?,
        val artist: String?
    )

}