/**
 * Created by jamesbaloney on 2017/7/10.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueTry {
    static Queue que = new LinkedList();
    static Scanner sc = new Scanner(System.in);
    static boolean wh1;

    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer(sc.next());
        q.offer(sc.next());
        q.offer(sc.next());
        Object o;
        System.out.println(q.toString());
        while ((o = q.poll()) != null) {
            String s = (String) o;
            System.out.println(s);
        }
        System.out.println(q.toString());


    }
}

