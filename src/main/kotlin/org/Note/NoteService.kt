package org.Note

class NoteService() : Crud {
    var notes: MutableList<Note> = arrayListOf()

    override fun add(note: Note): Note {
        val note = if (notes.isEmpty()) note.copy(noteId = 1)
        else note.copy(noteId = notes.last().noteId + 1)
        notes += note
        return notes.last()
    }

    override fun edit(noteNew: Note): Boolean {
        for ((index, note) in notes.withIndex()) {

            if (note.noteId == noteNew.noteId) {
                noteNew.ownerId = note.ownerId
                notes[index] = noteNew
                println(noteNew)
                return true
            }

        }
        return false
    }

    override fun delete(noteIdDelete: Int) {

        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (noteIdDelete)) {
                notes.removeAt(index)
                break
            }
        }
    }

    override fun getNotes(noteIds: List<Int>):List<Note> {
        var outputNotes: List<Note> = arrayListOf()
        for (index in notes) {
            for (index in noteIds) {
                if (noteIds[index] == notes[index].noteId) outputNotes += notes[index]
            }
        }
        return outputNotes
    }

    override fun getById(noteIdSearch: Int): Note? {
        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (noteIdSearch)) {
                return note
                break
            }
        }
        return null
    }


    override fun createComment() {
        TODO("Not yet implemented")
    }

    override fun editComment() {
        TODO("Not yet implemented")
    }


    override fun deleteComment() {
        TODO("Not yet implemented")
    }


    override fun getComments() {
        TODO("Not yet implemented")
    }

    override fun restoreComment() {
        TODO("Not yet implemented")
    }


}