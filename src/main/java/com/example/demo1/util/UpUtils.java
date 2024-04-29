package com.example.demo1.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传的工具类
 */
public class UpUtils {

    public static  final String BASE_PATH = "src/main/resources/static/";

    public static String  upFile(MultipartFile file, String path) throws IOException {
        if(file.isEmpty()){
            return null;
        }
        // /Users/xy/Documents/IdeaWorkSpaces/sys_video/src/main/resources/static/img/10.jpg
        String resPath = new File(BASE_PATH).getAbsolutePath() +"/"+ path+"/"+file.getOriginalFilename();
        File file1 = new File(resPath);
        if(!file1.getParentFile().exists()){
            file1.getParentFile().mkdirs();
        }
        file.transferTo(file1);
        return "http://localhost:8082/"+ path + "/"+ file.getOriginalFilename();
    }

}
