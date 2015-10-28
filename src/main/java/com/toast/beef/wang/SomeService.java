package com.toast.beef.wang;

/**
 * Created by lbwang on 10/9/15.
 */
public class SomeService {
    public void doSomething() {
        new InnerClass().go();
    }

    private class InnerClass {
        private void go() {
            System.err.println("do something in inner class");
        }
    }
}
