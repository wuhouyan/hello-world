package com.wuhy.controller;
//创建githut   新建项目并发布到git上      
public class UserController {
	
	public void testGit(){}
	
	public String change(){
		return "ok";
	}
	public String pull(){
	String a = "直接在github上修改，本地进行pull拉取";
		return a;
	}
	public void develop_test(){
		String develop="develop 测试合并";
	}
	public void develop_test_bran(){
		String develop="测试分支";
	}
	
	public void test(){
		String a="wuhy分支提交000000000";
	}

}
