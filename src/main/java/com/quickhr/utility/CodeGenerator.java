package com.quickhr.utility;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CodeGenerator {
	
	public String generateCode() {
		String uuid = UUID.randomUUID().toString();
		return Arrays.stream(uuid.split("-")).map(segment -> String.valueOf(segment.charAt(0)))
		             .collect(Collectors.joining());
	}
	
}
