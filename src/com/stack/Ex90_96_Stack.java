package com.stack;

import java.util.Stack;

public class Ex90_96_Stack {

	public static void main(String[] args) {
		Stack stack = new Stack(); //����һ��stackʵ��
		stack.push("����"); //��ջ
		stack.push("����");
		stack.push("����");
		stack.push("����");
		
		//����Ԫ�ء����塱��public int search(Object obj)���ض���obj��ջ�е�λ�ã�ջ��Ϊ1���������¼�1
		int index = stack.search("����");
		if (index > 0) {
			System.out.println("'����'�����еĵ�" + index + "��Ԫ��");
		} else
			System.out.println("ջ�в�����'����'");
		System.out.println("ջ�е�Ԫ�طֱ�Ϊ��");
		while(!stack.empty()) //��ջ��Ϊ��ʱ����ջ
			System.out.println(stack.pop()); //pop��ȡ��������
	}
}
