package prac_13_14;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeCode {
    List<String> array = new ArrayList<>();
    List<String> linked = new LinkedList<>();

    public TimeCode(){
        array.add("Today");
        array.add("is");
        array.add("eleven");
        array.add("of November");

        linked.add("Today");
        linked.add("is");
        linked.add("eleven");
        linked.add("of November");
    }

    public void timeAdd(String element) throws InterruptedException {
            Instant start = Instant.now();
            array.add(element);
            Thread.sleep(1000);
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            System.out.println("Time ArrayList add: " + elapsed + " ms");
            Instant startTime1 = Instant.now();
            linked.add(element);
            Thread.sleep(1000);
            long estimatedTime1 = Duration.between(startTime1, Instant.now()).toMillis();
            System.out.println("Time LinkedList add: " + estimatedTime1 + " ms");
            System.out.println("Difference: " + Math.abs(elapsed - estimatedTime1) + " ms");
            if (elapsed > estimatedTime1)
                System.out.println("LinkedList is Faster!");
            else if (elapsed == estimatedTime1) System.out.println("Time is equally");
            else System.out.println("ArrayList is Faster!");
    }

    public void timeDelete(String element) throws InterruptedException{
        Instant startTime = Instant.now();
        array.remove(element);
        Thread.sleep(1000);
        long estimatedTime = Duration.between(startTime, Instant.now()).toMillis();
        System.out.println("Time ArrayList remove: " + estimatedTime + " ms");
        Instant startTime1 = Instant.now();
        linked.remove(element);
        Thread.sleep(1000);
        long estimatedTime1 = Duration.between(startTime1, Instant.now()).toMillis();
        System.out.println("Time LinkedList remove: " + estimatedTime1 + " ms");
        System.out.println("Difference: " + Math.abs(estimatedTime - estimatedTime1) + " ms");
        if (estimatedTime > estimatedTime1)
            System.out.println("LinkedList is Faster!");
        else if (estimatedTime == estimatedTime1) System.out.println("Time is equally");
        else System.out.println("ArrayList is Faster!");
    }

    public void timeFind(String element) throws InterruptedException{
        Instant startTime = Instant.now();
        array.contains(element);
        Thread.sleep(1000);
        long estimatedTime = Duration.between(startTime, Instant.now()).toMillis();
        System.out.println("Time ArrayList contain: " + estimatedTime + " ms");
        Instant startTime1 = Instant.now();
        linked.contains(element);
        Thread.sleep(1000);
        long estimatedTime1 = Duration.between(startTime1, Instant.now()).toMillis();
        System.out.println("Time LinkedList contain: " + estimatedTime1 + " ms");
        System.out.println("Difference: " + Math.abs(estimatedTime - estimatedTime1) + " ms");
        if (estimatedTime > estimatedTime1)
            System.out.println("LinkedList is Faster!");
        else if (estimatedTime == estimatedTime1) System.out.println("Time is equally");
        else System.out.println("ArrayList is Faster!");
    }

    public void timeInsert(int index, String element) throws InterruptedException{
        Instant startTime = Instant.now();
        array.add(index, element);
        Thread.sleep(1000);
        long estimatedTime = Duration.between(startTime, Instant.now()).toMillis();
        System.out.println("Time ArrayList insert: " + estimatedTime + " ms");
        Instant startTime1 = Instant.now();
        linked.add(index, element);
        Thread.sleep(1000);
        long estimatedTime1 = Duration.between(startTime1, Instant.now()).toMillis();
        System.out.println("Time LinkedList insert: " + estimatedTime1 + " ms");
        System.out.println("Difference: " + Math.abs(estimatedTime - estimatedTime1) + " ms");
        if (estimatedTime > estimatedTime1)
            System.out.println("LinkedList is Faster!");
        else if (estimatedTime == estimatedTime1) System.out.println("Time is equally");
        else System.out.println("ArrayList is Faster!");
    }
}
