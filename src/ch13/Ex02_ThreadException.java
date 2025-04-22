package ch13;

class Ex02_Thread extends Thread {
    public void run() {
        throwException();
    }

    public void throwException()  {
        try {
            throw new Exception();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}


public class Ex02_ThreadException {
    public static void main(String[] args) throws Exception {
        Ex02_Thread t = new Ex02_Thread();
        t.start();
    }
}
