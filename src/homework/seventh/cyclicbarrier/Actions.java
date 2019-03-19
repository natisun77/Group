package homework.seventh.cyclicbarrier;

class Action implements Runnable {
    @Override
    public void run() {
        System.out.println("The barrier is reached");
    }
}

