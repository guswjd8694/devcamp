package ch13;

import javax.swing.*;

public class Ex11_InterruptSleep {
    public static void main(String[] args) throws Exception {
        Ex11_Thread t = new Ex11_Thread();
        t.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        t.interrupt();
        System.out.println("isInterrupted(): " + t.isInterrupted());
    }
}


class Ex11_Thread extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
//                interrupt();
            }
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}