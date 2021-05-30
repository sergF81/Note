package org.Note

interface Crud {   // Методы для работы с заметками.
    fun add(note: Note): Note // Создает новую заметку у текущего пользователя.
    fun createComment() //Добавляет новый комментарий к заметке.
    fun delete(noteIdDelete: Int) //Удаляет заметку текущего пользователя.
    fun deleteComment() //Удаляет комментарий к заметке.
    fun edit(note: Note): Boolean //Редактирует заметку текущего пользователя.
    fun editComment() //Редактирует указанный комментарий у заметки.
    fun getNotes(noteIds: List<Int>):List<Note> //Возвращает список заметок, созданных пользователем.
    fun getById(noteId: Int):Note? //Возвращает заметку по её id.
    fun getComments() //Возвращает список комментариев к заметке.
    fun restoreComment() //Восстанавливает удалённый комментарий.
}