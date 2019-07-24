package com.bdg.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkParser {

    private String content;
    //"I am going to redirect https:// this url / : https://www.google.com bye.";

    private final String urlPrefix = "https://";

    public LinkParser(String content) {
        this.content = content;
    }


    public List<String> getLinks() {
        if (!content.contains(urlPrefix)) {
            return Collections.emptyList();
        }

        final List<String> urls = new ArrayList<>();
        int middlewarePosition = content.indexOf(urlPrefix);
        while (this.containsUrl(middlewarePosition) && content.charAt(middlewarePosition - 1) == ' ') {
            for (int i = middlewarePosition + this.urlPrefix.length(); i < this.content.length(); i++) {
                if (symbolInRange('A', content.charAt(i), 'Z') ||
                        symbolInRange('a', content.charAt(i), 'z') || content.charAt(i) == '.') {
                    continue;
                } else if (content.charAt(i) == ' ' && !content.substring(middlewarePosition, i).contains(" ")) {
                    urls.add(content.substring(middlewarePosition, i));
                    middlewarePosition = i;
                    break;
                }
            }
        }
        return urls;
    }

    private boolean symbolInRange(char start, char symbol, char end) {
        return symbol >= start && symbol <= end;
    }

    private boolean containsUrl(int fromIndex) {
        return this.content.substring(fromIndex).contains(urlPrefix);
    }


    static List<String> strings = new ArrayList<>();

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            lock.lock();
            for (int i = 0; i < 1000; i++) {
                add(Thread.currentThread().getName() + " : index : " + i);
            }
            lock.unlock();
        }, "t_1");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            lock.lock();
            for (int i = 0; i < 10; i++) {
                add(Thread.currentThread().getName() + " : index : " + i);
            }
            lock.unlock();
        }, "t_2");

        t1.start();

        t2.start();


        t1.join();
        t2.join();

        for (String str : strings) {
            System.out.println(str);
        }
    }
    static void add(String content) {
        strings.add(content);
    }

}

enum Domains {
    com(".com"), org(".org"), ru(".ru");

    private String domainName;

    Domains(String domainName) {
        this.domainName = domainName;
    }

    public String domainName() {
        return this.domainName;
    }
}




















