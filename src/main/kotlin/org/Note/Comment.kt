package org.Note

data class Comment(
    val noteId: Int, //������������� �������.������������� �����, ������������ ��������
    val ownerId: Int = 0, //������������� ��������� �������.������������� �����, �� ��������� ������������� �������� ������������
    val message: String = "", // ����� �����������.������, ������������ �������
    val commentId: Int = 0//������������� �����������.������������� �����, ������������ ��������

)



// owner_id������������� ��������� �������. ������������� �����, �� ��������� ������������� �������� ������������
//reply_to������������� ������������, ������� �� ����������� �������� �������� ����������� ����������� (�� ���������, ���� ����������� �� �������� �������).������������� �����
