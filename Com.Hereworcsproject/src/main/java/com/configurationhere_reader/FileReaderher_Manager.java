package com.configurationhere_reader;

import java.io.IOException;

public class FileReaderher_Manager {
	
	public FileReaderher_Manager() {
		
	}
	
	public static FileReaderher_Manager getInstanceConfig() {
		FileReaderher_Manager f=new FileReaderher_Manager();
		return f;
	}
	
	
	public static Configurationhere_reader getconfigdata() throws IOException {
		Configurationhere_reader c=new Configurationhere_reader();
		return c;
		
	}
	
	
	

}
