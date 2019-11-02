package org.shahid.creational.factory.pluralsight;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

		System.out.println(site.getPages());

		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

		System.out.println(site.getPages());
	}

}
