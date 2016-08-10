package com.amqp.consumer;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import com.amqp.bean.BookBean;
import com.amqp.util.ObjectMessageUtil;

/**
 * 功能概要：消费接收
 */
public class MessageConsumer implements MessageListener {
	

	public void onMessage(Message message) {
		

		/*接受字符串*/
		String receiveStr = new String(message.getBody());
		System.out.println("receive message: "+receiveStr);
		
		/*接受VO方法 line25-30*/
//		String receiveStr = new String(message.getBody());
//		Object obj = ObjectMessageUtil.transform2Object(receiveStr);
//		//测试输出VO参数	
//		BookBean result = (BookBean)obj;
//		System.out.println(result.getBookId());
//		System.out.println(result.getBookName());
//		System.out.println(result.getBookEditer()[1]);
		
	}

}