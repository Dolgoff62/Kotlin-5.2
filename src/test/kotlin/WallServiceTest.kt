import org.junit.Test
import ru.netology.WallService
import ru.netology.Photo
import org.junit.Assert.*
import ru.netology.Post


class WallServiceTest {

    @Test
    fun add() {

        val result = WallService.add(Post(
            ownerId = 555,
            fromId = 12,
            createdBy = 567,
            date = 2020_09_01,
            text = "Hello, its my first post.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = "",
            copyright = "",
            likes = 10,
            repost = null,
            views = 15,
            postType = "",
            attachments = emptyArray(),
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        ))

        assertTrue(result.id != 0)
    }

    @Test
    fun update_True() {

        WallService.add(Post(
            ownerId = 555,
            fromId = 12,
            createdBy = 567,
            date = 2020_09_01,
            text = "Hello, its my first post.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = "",
            copyright = "",
            likes = 10,
            repost = null,
            views = 15,
            postType = "",
            attachments = emptyArray(),
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        ))

        val update = Post(
            id = 1,
            ownerId = 555,
            fromId = 12,
            createdBy = 567,
            date = 2020_09_01,
            text = "This is a Edited Post",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = "",
            copyright = "",
            likes = 55,
            repost = null,
            views = 154,
            postType = "",
            attachments = arrayOf(Photo(123, 321, 999, 12, "Collage", 2020_05_12)),
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0)

        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun update_False() {

        WallService.add(Post(
            ownerId = 555,
            fromId = 12,
            createdBy = 567,
            date = 2020_09_01,
            text = "Hello, its my first post.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = "",
            copyright = "",
            likes = 10,
            repost = null,
            views = 15,
            postType = "",
            attachments = emptyArray(),
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        ))


        val update = Post(
            id = 1,
            ownerId = 555,
            fromId = 12,
            createdBy = 567,
            date = 2020_09_01,
            text = "This is a Edited Post",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = "",
            copyright = "",
            likes = 55,
            repost = null,
            views = 154,
            postType = "",
            attachments = emptyArray(),
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0)

        val result = WallService.update(update)

        assertFalse(!result)
    }
}
