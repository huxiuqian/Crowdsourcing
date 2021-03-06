package com.erzu.zhongbao.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.erzu.zhongbao.pojo.Bussiness;
import com.erzu.zhongbao.pojo.Task;
import com.erzu.zhongbao.pojo.TaskDetail;
import com.erzu.zhongbao.pojo.TaskExample;

@Service
public interface BussinessService {

	//商家登陆
	Bussiness bussLogin(Bussiness buss);
	//商家修改密码
	public int bussChangePwd(Bussiness buss);
	//查看商家已发布的任务
	public List findTaskByBuss(int bussId); 
	//商家发布任务
	public int newTask(Task task);
	//查看对商家的评价 ...没有评价表  这个做个假的吧
	//商家注册
	public int bussRegister(Bussiness bussiness);
	//商家查看收到的消息
	public List findMessageByBuss(int bussId);
	//删除任务  假删除 ，设置 state状态
	public int deleteTask(int taskId);
	//商家接收此客户    这个是要修改state吗？？？
	public int  agreeUser(int taskId);
	//提交
	Bussiness getBussinessById(Integer bussinessid);
	//根据taskid获取任务的详细信息
	TaskDetail getDetailTask(Integer taskid);
	List<Task> busstasks(TaskExample example);
	//获取详细信息时的判断
	TaskDetail judgeDetail(Integer taskid);
}
