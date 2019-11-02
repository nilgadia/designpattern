package org.shahid.structural.proxy.pluralsight;

public interface TwitterService {
	public String getTimeline(String screenName);
	public void postToTimeline(String screenName, String message);
}
