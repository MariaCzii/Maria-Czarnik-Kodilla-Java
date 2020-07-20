package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a % b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText = poemBeautifier.beautify("Beautiful text", (text ->  text.toUpperCase()));
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Beautiful text", (text ->  text.toLowerCase()));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Beautiful text", (text -> "ABC" + text + "ABC" ));
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Beautiful text", (text ->
                text.concat(String.valueOf(text.hashCode()))));
        System.out.println(beautifulText4);

        String beautifulText5 = poemBeautifier.beautify("Beautiful text", (text ->  text.replaceAll(text, "Brak tekstu")));
        System.out.println(beautifulText5);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
