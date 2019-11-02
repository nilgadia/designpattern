package org.shahid.creational.factory.pluralsight;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}

			case SHOP : {
				return new Shop();
			}

			default : {
				return null;
			}
 		}
	}

}
