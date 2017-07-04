package javatools;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) throws Exception {
		GBK2UTF8();
	}
	
	static void GBK2UTF8() {
	    //GBK编码格式源码路径
	    String srcDirPath = "E:\\workplan\\02 project\\lvyou\\src";
	    //转为UTF-8编码格式源码路径
	    String utf8DirPath = "E:\\workplan\\02 project\\test";
	    utf8DirPath = srcDirPath;
	    //获取所有java文件
	    Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true);
	    for (File javaGbkFile : javaGbkFileCol) {
	    //UTF8格式文件路径	
	    String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
	    //使用GBK读取数据，然后用UTF-8写入数据
	    FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK")); 
	    System.out.print("utf8FilePath:" + utf8FilePath + " javaGbkFile:" + javaGbkFile + "\n");
	    }
	}

}
