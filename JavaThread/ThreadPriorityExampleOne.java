public class ThreadPriorityExampleOne {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
    }
}
