package org.Note

data class Comment(
    val commentId: Int = 0,//������������� �����������.������������� �����, ������������ ��������
    var noteId: Int = 0, //������������� �������.������������� �����, ������������ ��������
    var ownerId: Int = 0, //������������� ��������� �������.������������� �����, �� ��������� ������������� �������� ������������
    val message: String = "", // ����� �����������.������, ������������ �������
    var deleted: Boolean = false

)



// owner_id������������� ��������� �������. ������������� �����, �� ��������� ������������� �������� ������������
//reply_to������������� ������������, ������� �� ����������� �������� �������� ����������� ����������� (�� ���������, ���� ����������� �� �������� �������).������������� �����
