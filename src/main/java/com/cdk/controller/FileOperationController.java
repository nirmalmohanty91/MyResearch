package com.cdk.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.service.FileReadAndWriteSource;

@RestController
public class FileOperationController {
    @Autowired
    FileReadAndWriteSource fileService;

    @GetMapping("/fileOperation")
    public void fileReadWrite() throws IOException {
	fileService.fileReadWrite();
    }

}
