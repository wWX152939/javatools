package javatools;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) throws Exception {
	    //GBK�����ʽԴ��·��
	    String srcDirPath = "E:\\JavaProject\\touchfuture_test\\src";
	    //תΪUTF-8�����ʽԴ��·��
	    String utf8DirPath = "E:\\UTF8\\src";
	         
	    //��ȡ����java�ļ�
	    Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true);
	    for (File javaGbkFile : javaGbkFileCol) {
	    //UTF8��ʽ�ļ�·��
	    String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
	    //ʹ��GBK��ȡ���ݣ�Ȼ����UTF-8д������
	    FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));     
	    }
	}
}
