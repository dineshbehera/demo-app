package com.oned.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
 
@ConfigurationProperties(prefix = "demoapp")
@Configuration("appInfo")
public class AppInfo {
	private String message;
    private String title;
    private String version;
    private int build;
    private String env;
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getBuild() {
		return build;
	}
	public void setBuild(int build) {
		this.build = build;
	}
 
    
 
}