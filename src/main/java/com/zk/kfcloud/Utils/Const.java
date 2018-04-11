package com.zk.kfcloud.Utils;

import org.springframework.context.ApplicationContext;

public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_USER_RIGHTS = "sessionUserRights";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(index)|(logout)|(code)|(modifyPassword)|(checkLogin)).*";
	public static ApplicationContext WEB_APP_CONTEXT = null;
	public static final String PAGE = "admin/config/PAGE.txt";
}
