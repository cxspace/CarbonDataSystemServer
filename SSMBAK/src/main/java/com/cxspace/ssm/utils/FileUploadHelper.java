package com.cxspace.ssm.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * Created by liujie on 2017/8/19.
 */
public class FileUploadHelper {

    public static String uploadImg(MultipartFile file , HttpServletRequest request){

        String path = request.getSession().getServletContext().getRealPath("upload");

        String fileName = file.getOriginalFilename();

        file.getContentType();

        System.out.println(path+"-"+fileName+"-"+file.getContentType());

        fileName = UUID.randomUUID().toString()+".jpg";

        File targetFile = new File(path,fileName);

        if (!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try{
            file.transferTo(targetFile);
        }catch (Exception e){
            e.printStackTrace();
        }

        return fileName;
    }

}
