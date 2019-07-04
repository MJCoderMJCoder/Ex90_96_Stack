package com.stack;

import java.util.Stack;

public class Ex90_96_Stack {

	public static void main(String[] args) {
		Stack stack = new Stack(); //创建一个stack实例
		stack.push("张三"); //入栈
		stack.push("李四");
		stack.push("王五");
		stack.push("赵六");
		
		//查找元素“王五”；public int search(Object obj)返回对象obj在栈中的位置，栈顶为1，依次向下加1
		int index = stack.search("王五");
		if (index > 0) {
			System.out.println("'王五'是攒中的第" + index + "个元素");
		} else
			System.out.println("栈中不存在'王五'");
		System.out.println("栈中的元素分别为：");
		while(!stack.empty()) //当栈不为空时，出栈
			System.out.println(stack.pop()); //pop：取出、爆开
	}
}
