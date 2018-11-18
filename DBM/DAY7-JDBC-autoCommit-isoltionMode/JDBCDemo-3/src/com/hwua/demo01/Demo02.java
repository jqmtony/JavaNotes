package com.hwua.demo01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;


public class Demo02 {

    /**
     * @param args
     */
    private static int threadCount = 3;
    private static int blockSize;
    private static String path = "https://dldir1.qq.com/weixin/Windows/WeChatSetup.exe";
    private static int currentRunThreadCount = 0;
    public static void main(String[] args) {
        
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10 * 1000);
            int code = connection.getResponseCode();
            if(code == 200) {
                int fileLength = connection.getContentLength();
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(getFileName(path)), "rw");
                randomAccessFile.setLength(fileLength);
                blockSize = fileLength / threadCount;
                for(int i = 0; i < threadCount; i ++) {
                    int startThread = i * blockSize;
                    int endThread = (i + 1) * blockSize - 1;
                    if( i == blockSize - 1) endThread = fileLength -1;
                    new DownloadThread(i, startThread, endThread).start();
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static class DownloadThread extends Thread {
        private int threadId;
        private int endThread;
        private int startThred;
        public DownloadThread(int threadId, int startThred, int endThread) {
            this.threadId = threadId;
            this.startThred = startThred;
            this.endThread = endThread;
        }
        public void run() {    
            synchronized (DownloadThread.class) {
                currentRunThreadCount += 1;
            }
            //�ֶ������������ӣ��ֶα����ڱ���
            try {
                System.err.println("�����߳�:"+threadId+",��ʼλ��:"+startThred+",����λ��:"+endThread);
                URL url = new URL(path);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(10 * 1000);
                File file = new File(threadId+".txt");
                if(file.exists()) {    //�Ƿ�ϵ�
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    String lastPostion_str = bufferedReader.readLine();
                    startThred = Integer.parseInt(lastPostion_str);
                    bufferedReader.close();
                }
                //���÷ֶ����ص�ͷ��Ϣ  Range:���ֶ�
                connection.setRequestProperty("Range", "bytes:"+startThred+"-" + endThread);
                int code = connection.getResponseCode();
                System.out.println(code);
                if(code == 206) {    //200:����ȫ����Դ�ɹ�  206:��������Դ����ɹ�
                    InputStream inputStream = connection.getInputStream();
                    System.out.println(getFileName(path));
                    RandomAccessFile randomAccessFile = new RandomAccessFile(new File(getFileName(path)), "rw");
                    randomAccessFile.seek(startThred);
                    byte[] buffer = new byte[1024*10];
                    int length = -1;
                    int total = 0;//��¼���ص�����
                    System.err.println("ʵ���߳�:"+threadId+",��ʼλ��:"+startThred+",����λ��:"+endThread);
                    while((length = inputStream.read(buffer)) != -1) {
                        randomAccessFile.write(buffer, 0, length);
                        total += length;
                        int currentThreadPostion = startThred + total;
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
                        randomAccessFile2.write(String.valueOf(currentThreadPostion).getBytes());
                        randomAccessFile2.close();
                    }
                    randomAccessFile.close();
                    inputStream.close();
                    System.err.println("�߳�:"+threadId+"�������");
                    synchronized (DownloadThread.class) {
                        currentRunThreadCount -= 1;
                        if(currentRunThreadCount == 0){
                            for(int i = 0; i < threadCount; i ++) {
                                File file2 = new File(i+".txt");
                                file2.delete();
                            }
                        }
                    }
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
             
            super.run();
        }
    }
    
    public static String getFileName(String path) {
        return path.substring(path.lastIndexOf("/")+1);
    }

}