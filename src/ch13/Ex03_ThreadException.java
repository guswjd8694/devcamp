package ch13;


class Ex03_Thread extends Thread {
    public void run() {
        throwException();
    }

    public void throwException(){
        try {
            throw new Exception();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class Ex03_ThreadException {
    public static void main(String[] args) throws Exception{
        Ex03_Thread t = new Ex03_Thread();
        t.run();
    }
}
