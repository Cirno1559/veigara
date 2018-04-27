package com.hxzy.entity.authority;

import java.io.Serializable;

/**
 * @author 
 */
public class Admin implements Serializable {
    /**
     * 用户表 主键
     */
    private Integer adminId;

    /**
     * 用户名
     */
    private String adminLoginName;

    private String adminLoginPwd;

    /**
     * 0 ：离职 1：在职
     */
    private Integer adminState;

    /**
     * 外键 部门ID
     */
    private Department department;

    /**
     * 外键 职位编号
     */
    private Job job;

    /**
     * 角色 外外键
     */
    private Role role;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
    }

    public String getAdminLoginPwd() {
        return adminLoginPwd;
    }

    public void setAdminLoginPwd(String adminLoginPwd) {
        this.adminLoginPwd = adminLoginPwd;
    }

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


   
}