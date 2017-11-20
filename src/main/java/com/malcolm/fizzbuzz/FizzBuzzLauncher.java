package com.malcolm.fizzbuzz;

public class FizzBuzzLauncher {

    private FizzBuzzProcessor fizzBuzzProcessor;

    public void go(int lowerLimit, int upperLimit) {
       FizzBuzzProcessor fizzBuzzProcessor = FizzBuzzProcessorFactory.getFizzBuzzProcessor(FizzBuzzProcessorFactory.FizzBuzzProcessorType.LUCKY);
       for (int i = lowerLimit; i <= upperLimit; i++) {
           System.out.println(fizzBuzzProcessor.process(i));
       }
    }

}
