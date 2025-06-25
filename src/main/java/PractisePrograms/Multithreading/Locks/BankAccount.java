package PractisePrograms.Multithreading.Locks;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount{
    private double balance = 100.00;

    private final Lock lock = new ReentrantLock();

    public void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + ": withdrawing " + amount + " from bank");
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + "proceeding with withdrawal");
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() + "completed withdrawal. Remaining balance: " + balance);

                    }catch(Exception e){
                        Thread.currentThread().interrupt();
                    }
                    finally{
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "Insufficientb balance");

                }
            }else{
                System.out.println(Thread.currentThread().getName() + "could not acquire lock, will try again later");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();

        }
    }
}