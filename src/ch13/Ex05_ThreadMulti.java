package ch13;

public class Ex05_ThreadMulti {
    static long startTime = 0;

    public static void main(String[] args) {
        Ex05_Thread t = new Ex05_Thread();
        t.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - Ex05_ThreadMulti.startTime));
    }
}


class Ex05_Thread extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - Ex05_ThreadMulti.startTime));
    }
}
