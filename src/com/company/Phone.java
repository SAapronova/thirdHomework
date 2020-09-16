package com.company;

public class Phone {
   private long number;
   private String model;
   private int weight;


    public Phone() {

    }
    public Phone(long number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }


    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

   public void receiveCall(String name,long number){
       System.out.println("Звонит "+name+" по номеру "+number);
   }
   public void sendMessage(long...numbers){
       System.out.println(numbers);

   }
    public long getNumber() {
        return number;
    }


}
