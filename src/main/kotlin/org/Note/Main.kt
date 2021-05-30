package org.Note

fun main() {
    val r = NoteService()
    r.add(Note(ownerId = 2, text = "Проверка2"))
    r.add(Note(ownerId = 3, text = "Проверка3"))
    r.add(Note(ownerId = 7, text = "Проверка7"))
    r.add(Note(ownerId = 8, text = "Проверка8"))
    println(r.notes.toList())
    val a = Note(noteId = 2,3, text = "Проверка9")
    r.edit(a)
    r.delete(2)

    println(r.notes.toList())

println(r.getById(4))
    //  val list: MutableList<Int> = listOf(1, 3, 4 ) as MutableList<Int>
    print("Мульти ")
    println(r.getNotes(listOf(1, 4, 3)))
}