package com.bigbanana.lab.Session2;

public interface Stack {

	/**
	 * 入栈
	 * @return
	 */
	boolean push(int value);

	/**
	 * 出栈
	 * @return
	 */
	int pop();

	/**
	 * 查看栈顶元素
	 */

	int peak();

	/**
	 * 栈的大小
	 */

	int size();

	/**
	 * 栈是否为空
	 * @return
	 */
	boolean isEmpty();

}
