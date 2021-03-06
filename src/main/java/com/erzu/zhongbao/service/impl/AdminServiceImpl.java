package com.erzu.zhongbao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erzu.zhongbao.controller.AdminController;
import com.erzu.zhongbao.dao.AdminMapper;
import com.erzu.zhongbao.dao.BussinessMapper;
import com.erzu.zhongbao.dao.TaskMapper;
import com.erzu.zhongbao.dao.TypeMapper;
import com.erzu.zhongbao.dao.UserMapper;
import com.erzu.zhongbao.pojo.Admin;
import com.erzu.zhongbao.pojo.Bussiness;
import com.erzu.zhongbao.pojo.Task;
import com.erzu.zhongbao.pojo.TaskExample;
import com.erzu.zhongbao.pojo.Type;
import com.erzu.zhongbao.pojo.User;
import com.erzu.zhongbao.service.AdminService;
import com.erzu.zhongbao.vo.TaskInfo;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private BussinessMapper bussinessMapper;
	@Autowired
	private UserMapper	 userMapper;
	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private TypeMapper typeMapper;
	@Override
	public List<Task> taskList(TaskExample te) {
		return taskMapper.selectByExample(te);
	}

	@Override
	public List<User> userList() {
		return userMapper.getUsers();
	}

	@Override
	public List<Bussiness> bussinessList() {
		return bussinessMapper.getBussiness();
	}

	@Override
	public Admin login(String adminname, String password) {
		return adminMapper.queryByNameAndPwd(adminname, password);
	}

	@Override
	public List<TaskInfo> getAllTasksPage() {
		return taskMapper.getAlltasksPage();
	}
	/**
	 * 添加类别
	 */
	public int addType(Type type) {
		return typeMapper.insert(type);
	} 

	/**
	 * 删除类别
	 */
	public int deleteType(Type type) {
		int typeid = type.getTypeid();
		return typeMapper.deleteByPrimaryKey(typeid);
	}

	@Override
	public Task selectByTaskid(int taskid) {
		// TODO Auto-generated method stub
		return taskMapper.selectByPrimaryKey(taskid);
	}

	@Override
	public int updateByPrimaryKeySelective(Task record){
		
		return taskMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}
}
