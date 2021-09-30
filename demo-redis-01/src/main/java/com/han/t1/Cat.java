package com.han.t1;

import lombok.Data;

import java.io.Serializable;

/**
 * @author blueSky
 * @create 05-06 19:54
 */

@Data
public class Cat implements Serializable {
//	public static final Long serialVersionUID = 12306L;

	private Integer id;
	private String color;
}
