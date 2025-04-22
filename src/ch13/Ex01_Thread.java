package ch13;

class Ex01_Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());  // 조상인 Thread의 getName() 호출
        }
    }
}

class Ex01_Thread2 implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
//            Thread.currentThread()  - 현재 실행 중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Ex01_Thread {
    public static void main(String[] args) {
        Ex01_Thread1 t1 = new Ex01_Thread1();
        Runnable r = new Ex01_Thread2();
        Thread t2 = new Thread(r);  // 생성자 Thread(Runnable target)

        t1.start();
        t2.start();
    }
}
