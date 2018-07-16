package com.cdk.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
public class FileReadAndWriteSource {
    @Value("${filepath.soucefiles.sourcefile1}")
    String sourcefile1;
    @Value("${filepath.targetfiles.targetfile1}")
    String targetfile1;

    public void fileReadWrite() throws IOException {
	File file = ResourceUtils.getFile(sourcefile1);
	// String content = new String(Files.readAllBytes(file.toPath()));
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	// Writing to a file With Java – JDK 6
	File destinationFile = new File("src/main/resources/Target1.txt");
	FileWriter fileWriter = new FileWriter(destinationFile);
	// Writing to a file With Java – JDK 7
	StringBuffer stringBuffer = new StringBuffer();
	String line;
	while ((line = bufferedReader.readLine()) != null) {
	    stringBuffer.append(line);
	    stringBuffer.append("\n");
	    fileWriter.write(line);
	    fileWriter.append("\n");
	}
	fileWriter.flush();
	fileWriter.close();
	fileReader.close();
	System.out.println("Contents of file:");
	System.out.println(stringBuffer.toString());
	// System.out.println(content);
    }
}
