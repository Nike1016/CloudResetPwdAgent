package com.huawei.cloud.resetpwd.autoupdate.agent.constant;

import com.huawei.cloud.resetpwd.autoupdate.agent.util.PropertiesUtil;

/**
 * Created by Archers Law <archerslaw@163.com> on 2017/8/11.
 */
public class ConfigInfo {
    public static final String RESOURCE_PATH = "/CloudResetPwdUpdateAgent/conf/resource.properties";
    public static final String RESET_PWD_AGENT_VERSION_KEY = "resetPwdAgentVersion";

    public static final String OBS_URL = PropertiesUtil.getValue("obsUrl");
    public static final String REMOTE_VERSION_FILE = PropertiesUtil.getValue("remoteVersionFile");
    public static final String DOWNLOAD_FILE_PATH = PropertiesUtil.getValue("downLoadFilePath");
    public static final String UPDATE_FILE_PATH = PropertiesUtil.getValue("updateFilePath");
    public static final String INSTALL_PATH = PropertiesUtil.getValue("installPath");
    public static final String COVER_FILE_PATH = PropertiesUtil.getValue("coverFilePath");
}
