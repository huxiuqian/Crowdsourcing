package com.erzu.zhongbao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erzu.zhongbao.dao.MessageMapper;
import com.erzu.zhongbao.pojo.Message;
import com.erzu.zhongbao.pojo.User;
import com.erzu.zhongbao.service.MessageService;
import com.erzu.zhongbao.vo.MessageInfo;
@Service
public class MessageServiceImpl implements MessageService{
	@Autowired      //自动注入
	private MessageMapper messageMapper;
	//查询所有 Message
	@Override
	public List<Message> selectMessageList(int userId, int index, int num) {
		return messageMapper.getMessage(userId ,(index-1)*num, num);
	}
	//根据MessageId查询 信息
	@Override
	public MessageInfo selectMessageById(int msgid) {
		
		return messageMapper.getMessageByIdd(msgid);
	}
	//添加回复信息
	@Override
	public int insertMessage(Message record) {
		return messageMapper.insert(record);
	}
	//根据 taskid和Bussid查询用户名
	public User selectUserNameByTwoId(int bussinessid,int taskid){
		return messageMapper.getUserIdBytaskIdandBussId(bussinessid, taskid);	
	}
	/*//插入数据库
	public int insertIntoSql(int bussinessid ,int userid,String msgcontents,Date msgtime){
		return messageMapper.insertintoSQlBUs(bussinessid, userid, msgcontents, msgtime);
	}
	*/
	
	
	

}
