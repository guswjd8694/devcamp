package ch13;

public class Ex08_ThreadPriority {
    public static void main(String[] args) {
        Ex08_ThreadSingle single = new Ex08_ThreadSingle();
        Ex08_ThreadMulti multi = new Ex08_ThreadMulti();

        multi.setPriority(7);

        System.out.println("Priority of single(-) : " + single.getPriority());
        System.out.println("Priority of multi(|) : " + multi.getPriority());

        single.start();
        multi.start();
    }
}

class Ex08_ThreadSingle extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 1000000; x++);
        }
    }
}


class Ex08_ThreadMulti extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 1000000; x++);
        }
    }
}
