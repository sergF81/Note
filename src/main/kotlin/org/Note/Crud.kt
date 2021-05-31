package org.Note

import org.w3c.dom.Entity

interface Crud <E>{   // ������ ��� ������ � ���������.
    fun add(entity: E): E // ������� ����� ������� � �������� ������������.
    //fun createComment() //��������� ����� ����������� � �������.
    fun delete(IdDelete: Int):Boolean //������� ������� �������� ������������.
   // fun deleteComment() //������� ����������� � �������.
    fun edit(entity: E): Boolean //����������� ������� �������� ������������.
  //  fun editComment() //����������� ��������� ����������� � �������.
    fun getNotes(Ids: List<Int>):List<E> //���������� ������ �������, ��������� �������������.
    fun getById(IdSearch: Int):E? //���������� ������� �� � id.
  //  fun getComments() //���������� ������ ������������ � �������.
    fun restoreComment() //��������������� �������� �����������.
}