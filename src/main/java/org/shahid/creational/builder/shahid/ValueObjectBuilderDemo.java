package org.shahid.creational.builder.shahid;

import java.time.LocalDateTime;

public class ValueObjectBuilderDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ValueObject vo = ValueObject.builder().createdBy("Shahid").createdDt(LocalDateTime.now()).modifiedBy("Shahid")
				.modifiedDt(LocalDateTime.now()).build();
		vo.builder().modifiedBy("tarun");
		System.out.println(vo);
	}
}
