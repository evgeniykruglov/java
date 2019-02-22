package ru.ostap73;

public class Computer {
    class Processor {
        private boolean isStart = false;
        public void start () {
            isStart = true;
            System.out.println("processor="+isStart);
        }
        public void shutdown () {
            isStart = false;
            System.out.println("processor="+isStart);
        }
    }
    class RAM {
        private boolean isStart = false;
        public void start () {
            isStart = true;
            System.out.println("memory="+isStart);
        }
        public void shutdown () {
            isStart = false;
            System.out.println("memory="+isStart);
        }
    }

    Processor i7 = new Processor();
    RAM trnsfer= new RAM();
}
