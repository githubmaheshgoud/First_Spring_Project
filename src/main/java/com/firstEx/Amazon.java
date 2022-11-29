package com.firstEx;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Amazon {

	private String app;
	private List<String> items;
	private Set<Integer> id;
	private Map<Integer, String> shirt;
	private Properties jeans;

}
