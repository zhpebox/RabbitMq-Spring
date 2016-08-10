package com.amqp.producer;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * 功能概要：消息产生,提交到队列中去
 */
public class MessageProducer {

	@Resource
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Object message) {
		amqpTemplate.convertAndSend("queueTestKey", message);
	}
}