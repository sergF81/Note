package org.Note

import org.Note.NoteService.Companion.notes


class CommentService : Crud<Comment> {
    var comments: MutableList<Comment> = arrayListOf()

    override fun add(comment: Comment): Comment {
        for ((index, note) in notes.withIndex()) {
            if ((notes[index].noteId == comment.noteId) && notes[index].deleted == false) {
                val comment = if (comments.isEmpty()) comment.copy(commentId = 1)
                else comment.copy(commentId = comments.last().commentId + 1)
                comments.plusAssign(comment)

            } else throw  NoteNotFoundException()

        }
        return comments.last()
    }

    override fun delete(IdDelete: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun edit(entity: Comment): Boolean {
        TODO("Not yet implemented")
    }

    override fun getNotes(Ids: List<Int>): List<Comment> {
        TODO("Not yet implemented")
    }

    override fun getById(IdSearch: Int): Comment? {
        TODO("Not yet implemented")
    }

    override fun restoreComment() {
        TODO("Not yet implemented")
    }


}