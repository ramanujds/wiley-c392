package threadsbasics;

class MyDownloader implements Runnable {

    public void download() {
        System.out.println("Downloading File");
        for (int i = 1; i <= 10; i++) {
            System.out.println("From " + Thread.currentThread().getName() + " : " + i * 10 + "% Downloaded");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Download Complete");
    }

    public void run(){
        download();
    }

}

public class ThreadWithRunnable {

    public static void main(String[] args) throws InterruptedException {
        MyDownloader downloader = new MyDownloader();

        Thread downloader1 = new Thread(downloader);
        Thread downloader2 = new Thread(downloader);
        Thread downloader3 = new Thread(downloader);
        downloader1.start();
        downloader2.start();
        downloader3.start();


    }

}
