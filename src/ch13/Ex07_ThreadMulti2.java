package ch13;

import javax.swing.*;

public class Ex07_ThreadMulti2 {
    public static void main(String[] args) {
        Ex07_Thread t = new Ex07_Thread();
        t.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입려하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}

class Ex07_Thread extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
