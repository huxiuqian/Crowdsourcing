package com.erzu.zhongbao.service;

import java.util.List;

//import org.apache.ibatis.annotations.Param;

import com.erzu.zhongbao.pojo.Admin;
import com.erzu.zhongbao.pojo.Bussiness;
import com.erzu.zhongbao.pojo.Task;
import com.erzu.zhongbao.pojo.TaskExample;
import com.erzu.zhongbao.pojo.Type;
import com.erzu.zhongbao.pojo.User;
import com.erzu.zhongbao.vo.TaskInfo;

public interface AdminService {
	List<Task> taskList(TaskExample te);
	List<TaskInfo> getAllTasksPage();
	List<User> userList();
	List<Bussiness> bussinessList();
	Admin login(String username,String password);
	//添加类别
	int addType(Type type);
	//删除类别
	int deleteType(Type type);
	//查询Task
	Task selectByTaskid(int taskid);
	int updateByPrimaryKeySelective(Task record);
	
	User selectByPrimaryKey(Integer userid);
	int updateByPrimaryKeySelective(User record);
}
