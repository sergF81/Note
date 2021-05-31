package org.Note

import org.w3c.dom.Entity

class NoteService : Crud<Note> {
   companion object {var notes: MutableList<Note> = arrayListOf()}

    override fun add(note: Note): Note {
        val note = if (notes.isEmpty()) note.copy(noteId = 1)
        else note.copy(noteId = notes.last().noteId + 1)
        notes.plusAssign(note)
        return notes.last()
    }

    override fun edit(noteNew: Note): Boolean {
        for ((index, note) in notes.withIndex()) {
            if (note.noteId == noteNew.noteId) {
                if (note.deleted == false) {
                    noteNew.ownerId = note.ownerId
                    notes[index] = noteNew
                    println(noteNew)
                    return true
                }
            }

        }
        return false
    }

    override fun delete(IdDelete: Int): Boolean {

        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (IdDelete)) {
                note.deleted = true
                return true
            }
        }
        return false
    }

    override fun getNotes(Ids: List<Int>): List<Note> {
        var outputNotes: List<Note> = arrayListOf()
        for ((index1, note) in notes.withIndex()) {
            for ((index, element) in Ids.withIndex()) {
                if (Ids[index] == notes[index1].noteId) {
                    if (notes[index1].deleted == false) outputNotes += notes[index1]
                } else continue
            }
        }
        return outputNotes
    }

    override fun getById(IdSearch: Int): Note? {
        for ((index, note) in notes.withIndex()) {
            if (notes[index].noteId === (IdSearch)) {
                if (notes[index].deleted == false)
                    return note
                break
            }
        }
        throw  NoteNotFoundException()
    }

    override fun restoreComment() {
        TODO("Not yet implemented")
    }
}