package ch13;

import javax.swing.*;

public class Ex10_InterruptFor {
    public static void main(String[] args) throws Exception {
        Ex10_Thread t = new Ex10_Thread();
        t.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        t.interrupt();
        System.out.println("isInterrupted(): " + t.isInterrupted());
    }
}


class Ex10_Thread extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++);
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}