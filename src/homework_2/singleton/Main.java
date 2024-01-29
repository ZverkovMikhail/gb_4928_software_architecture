package homework_2.singleton;

import homework_2.factory_method.GenGarbageReward;
import homework_2.factory_method.GenGemReward;
import homework_2.factory_method.GenGoldReward;
import homework_2.factory_method.GenItem;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Singleton init value");
        System.out.println(singleton.value);
        singleton = Singleton.getInstance("Singleton new value");
        System.out.println(singleton.value);
    }
}