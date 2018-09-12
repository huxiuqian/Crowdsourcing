package com.erzu.zhongbao.service;

import java.util.Date;
import java.util.List;

import com.erzu.zhongbao.pojo.Message;
import com.erzu.zhongbao.pojo.User;
import com.erzu.zhongbao.vo.MessageInfo;

public interface MessageService {
	
	//查询所有Message
	List<Message> selectMessageList(int userId,int index, int num);
	
	//根据 Messageid 查询 信息
	MessageInfo selectMessageById(int msgid);
	
	//插入 Message
	int insertMessage(Message record);
	
	//根据userid和bussinessid
	User selectUserNameByTwoId(int bussinessid,int taskid);
	
	/*int insertIntoSql(int bussinessid ,int userid,String msgcontents,Date msgtime);*/
	



}
