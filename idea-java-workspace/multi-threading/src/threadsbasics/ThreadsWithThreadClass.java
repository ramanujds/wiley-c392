package threadsbasics;

class FileDownloader extends Thread{
    public void download(){
        System.out.println("Downloading File");
        for(int i=1; i<=10; i++){
            System.out.println("From "+getName()+" : "+ i*10+"% Downloaded");
            if (i==3 && getName().equals("Downloader 1")){
                Thread.yield();
            }

//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("Download Complete");
    }

    public void run() {
        download();
    }
}

public class ThreadsWithThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileDownloader downloader1 = new FileDownloader();
        FileDownloader downloader2 = new FileDownloader();
        FileDownloader downloader3 = new FileDownloader();

        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");
        downloader3.setName("Downloader 3");

//        downloader1.setPriority(Thread.MAX_PRIORITY);
//        downloader2.setPriority(Thread.MIN_PRIORITY);



        downloader1.start();
        downloader2.start();
        downloader3.start();


        try {
            downloader1.join();
            downloader2.join();
            downloader3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName());
        long difference = (endTime-startTime)/1000;
        System.out.println("Time Taken = "+difference+" secs");
    }
}
