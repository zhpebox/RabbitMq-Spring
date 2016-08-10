package com.mq.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.amqp.bean.BookBean;
import com.amqp.producer.MessageProducer;
import com.amqp.util.ObjectMessageUtil;

public class TestMain {

	public static void main(String[] args) {
		
		String configStr = "application*.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configStr);
		context.start();
		
		MessageProducer send = (MessageProducer) context.getBean("MessageProducer");
		
		/*向mq发送VO代码参考 line19-25*/
//		BookBean bean = new BookBean();
//		bean.setBookId(6);
//		bean.setBookName("水浒传a");
//		bean.setBookEditer(new String[]{"吴承恩","施耐庵"});
//		
//		String serObj = ObjectMessageUtil.transform2String(bean);
//		send.sendMessage(serObj.getBytes());
		
		
		/*发送字符串参考*/
		String serStr = "hello Rabbit!";
		send.sendMessage(serStr.getBytes());
		
		
		System.out.println("OK");
		
	}
}
