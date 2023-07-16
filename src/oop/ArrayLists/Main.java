package oop.ArrayLists;

import oop.inhr.account.Account;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        array[0] = 30;
        System.out.println(array);
        System.out.println(array[0]);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(80);
        list.add(20);

        System.out.println(list);

        list.add(2, 45);
        System.out.println(list);

        list.set(2, 55555);
        System.out.println(list);

        for (Integer i: list){
            if (i%2!=0){
                System.out.println("Num " + i + " Odd");
            }else {
                System.out.println("Num " + i + " Even");
            }
        }


        ArrayList<Account> accountArrayList = new ArrayList<>();
        Account account = new Account("Sami", 0, "USD", 200);
        Account account1 = new Account("ali", 1, "ILS", 500);
        Account account2 = new Account("mona", 2, "INR", 200);
        Account account3 = new Account("TaTi", 3, "JOD", 200);
        accountArrayList.add(account3);
        accountArrayList.add(account);
        accountArrayList.add(account2);
        accountArrayList.add(account1);


        //System.out.println(accountArrayList);

        for (Account acc:accountArrayList) {
            System.out.println(acc.getName());
        }


        System.out.println(accountArrayList.get(0).getName());

        accountArrayList.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Integer.compare(o1.getNo(), o2.getNo());
            }
        });

        System.out.println(accountArrayList);
        List list1 = Arrays.asList("sami", "ali"  , "mosa");
        ArrayList<String> arrayList = new ArrayList<>(list1);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("sami"));

        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("mosa");
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);



    }
}
